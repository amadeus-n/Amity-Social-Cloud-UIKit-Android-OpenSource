package com.amity.socialcloud.uikit.community.setting.user

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amity.socialcloud.sdk.core.user.AmityUser
import com.amity.socialcloud.uikit.common.common.showSnackBar
import com.amity.socialcloud.uikit.common.utils.AmityAlertDialogUtil
import com.amity.socialcloud.uikit.community.R
import com.amity.socialcloud.uikit.community.profile.activity.AmityEditUserProfileActivity
import com.amity.socialcloud.uikit.community.setting.AmitySettingsItem
import com.amity.socialcloud.uikit.community.setting.AmitySettingsItemAdapter
import com.ekoapp.rxlifecycle.extension.untilLifecycleEnd
import com.trello.rxlifecycle3.components.support.RxFragment
import kotlinx.android.synthetic.main.amity_fragment_user_settings.*

class AmityUserSettingsFragment :
    RxFragment(R.layout.amity_fragment_user_settings) {

    private val settingsListAdapter = AmitySettingsItemAdapter()
    lateinit var viewModel: AmityUserSettingsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(AmityUserSettingsViewModel::class.java)
        setUpSettingsRecyclerView()
    }

    private fun setUpSettingsRecyclerView() {
        progressbar.visibility = View.VISIBLE
        rvUserSettings.apply {
            adapter = settingsListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        getCommunitySettingsItems()
    }

    private fun getCommunitySettingsItems() {
        viewModel.getSettingsItemBasedOnStatus(
            otherUserMenuCreator = AmityOtherUserSettingsMenuCreatorImpl(this),
            selfMenuCreator = AmityUserSettingsMenuCreatorImpl(this),
            onResult = this::renderItems,
            onError = this::showErrorLayout
        ).untilLifecycleEnd(this)
            .subscribe()
    }

    private fun showErrorLayout() {
        rvUserSettings.visibility = View.GONE
        errorLayout.visibility = View.VISIBLE
    }

    private fun renderItems(items: List<AmitySettingsItem>) {
        settingsListAdapter.setItems(items)
        progressbar.visibility = View.GONE
    }

    private fun unfollowUser(userId: String) {
        viewModel.unfollowUser(userId)
            .doOnError {
                showFollowErrorDialog()
            }.untilLifecycleEnd(this)
            .subscribe()
    }

    internal fun showUnfollowDialog(userId: String) {
        AmityAlertDialogUtil.showDialog(
            requireContext(),
            getString(R.string.amity_unfollow_user, viewModel.user?.getDisplayName() ?: ""),
            getString(R.string.amity_unfollow_description, viewModel.user?.getDisplayName() ?: ""),
            getString(R.string.amity_unfollow),
            getString(R.string.amity_cancel),
            DialogInterface.OnClickListener { dialog, which ->
               if (which == DialogInterface.BUTTON_POSITIVE) {
                   unfollowUser(userId)
               }
                dialog.cancel()
            })
    }

    internal fun reportUser(user: AmityUser) {
        if (user.isFlaggedByMe()) {
            viewModel.unReportUser(user)
                .doOnComplete {
                    rvUserSettings.showSnackBar(getString(R.string.amity_unreport_sent))
                }.untilLifecycleEnd(this)
                .subscribe()
        } else {
            viewModel.reportUser(user)
                .doOnComplete {
                    rvUserSettings.showSnackBar(getString(R.string.amity_report_sent))
                }.untilLifecycleEnd(this)
                .subscribe()
        }
    }

    internal fun editProfile() {
        val intent = AmityEditUserProfileActivity.newIntent(requireContext())
        startActivity(intent)
    }

    private fun showFollowErrorDialog() {
        AmityAlertDialogUtil.showDialog(requireContext(),
            getString(R.string.amity_unfollow_error, viewModel.user?.getDisplayName() ?: ""),
            getString(R.string.amity_something_went_wrong_pls_try),
            getString(R.string.amity_ok), null,
            DialogInterface.OnClickListener { dialog, which ->
                if (which == DialogInterface.BUTTON_POSITIVE) {
                    dialog.cancel()
                }
            })
    }

    internal fun shareUserProfile(userId: String) {

    }

    class Builder internal constructor() {
        private lateinit var user: AmityUser

        fun build(activity: AppCompatActivity): AmityUserSettingsFragment {
            val fragment = AmityUserSettingsFragment()
            fragment.viewModel =
                ViewModelProvider(activity).get(AmityUserSettingsViewModel::class.java)
            fragment.viewModel.user = user
            return fragment
        }

        internal fun setUser(user: AmityUser): Builder {
            this.user = user
            return this
        }
    }

    companion object {
        fun newInstance(user: AmityUser): Builder {
            return Builder().setUser(user)
        }
    }
}