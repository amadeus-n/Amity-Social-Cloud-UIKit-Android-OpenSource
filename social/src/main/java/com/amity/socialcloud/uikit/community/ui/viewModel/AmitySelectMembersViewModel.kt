package com.amity.socialcloud.uikit.community.ui.viewModel

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.amity.socialcloud.sdk.AmityCoreClient
import com.amity.socialcloud.sdk.core.user.AmityUser
import com.amity.socialcloud.sdk.core.user.AmityUserSortOption
import com.amity.socialcloud.uikit.common.base.AmityBaseViewModel
import com.amity.socialcloud.uikit.common.model.AmityEventIdentifier
import com.amity.socialcloud.uikit.community.data.AmitySelectMemberItem
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class AmitySelectMembersViewModel : AmityBaseViewModel() {

    val searchString = ObservableField("")
    val selectedMembersList: ArrayList<AmitySelectMemberItem> = arrayListOf()
    val selectedMemberSet: HashSet<String> = hashSetOf()
    val memberMap: HashMap<String, Int> = hashMapOf()
    val searchMemberMap: HashMap<String, Int> = hashMapOf()
    val isSearchUser = ObservableBoolean(false)
    val leftString = MutableLiveData<String>("")
    val rightStringActive = MutableLiveData<Boolean>(false)

    fun getAllUsers(): Flowable<PagedList<AmityUser>> {
        val userRepo = AmityCoreClient.newUserRepository()
        return userRepo.searchUserByDisplayName("")
            .build().query()
    }

    fun searchUser(onResult: (list: PagedList<AmityUser>) -> Unit): Completable {
        val userRepo = AmityCoreClient.newUserRepository()
        return userRepo.searchUserByDisplayName(searchString.get() ?: "")
            .sortBy(AmityUserSortOption.DISPLAYNAME)
            .build()
            .query()
            .throttleLatest(1, TimeUnit.SECONDS, true)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                onResult.invoke(it)
            }
            .ignoreElements()
    }

    fun prepareSelectedMembersList(memberAmity: AmitySelectMemberItem, isSelected: Boolean) {
        if (isSelected) {
            selectedMembersList.add(memberAmity)
        } else {
            selectedMembersList.remove(memberAmity)
        }
    }

    fun setPropertyChangeCallback() {
        searchString.addOnPropertyChanged {
            triggerEvent(AmityEventIdentifier.SEARCH_STRING_CHANGED)
        }
    }
}