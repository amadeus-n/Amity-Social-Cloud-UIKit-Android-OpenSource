package com.amity.socialcloud.uikit.community.setting.postreview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amity.socialcloud.sdk.social.community.AmityCommunity
import com.amity.socialcloud.uikit.common.utils.AmityAlertDialogUtil
import com.amity.socialcloud.uikit.community.R
import com.amity.socialcloud.uikit.community.setting.AmitySettingsItem
import com.amity.socialcloud.uikit.community.setting.AmitySettingsItemAdapter
import com.ekoapp.rxlifecycle.extension.untilLifecycleEnd
import com.trello.rxlifecycle3.components.support.RxFragment
import kotlinx.android.synthetic.main.amity_fragment_post_review.*

class AmityPostReviewSettingsFragment :
    RxFragment(R.layout.amity_fragment_post_review) {

    private val settingsListAdapter = AmitySettingsItemAdapter()
    private lateinit var viewModel: AmityPostReviewSettingsViewModel

    companion object {
        fun newInstance(communityId: String): Builder {
            return Builder().communityId(communityId)
        }

        @Deprecated("Use communityId instead")
        fun newInstance(community: AmityCommunity): Builder {
            return Builder().communityId(community.getCommunityId())
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            ViewModelProvider(requireActivity()).get(AmityPostReviewSettingsViewModel::class.java)
        setupPostReviewListRecyclerView()
    }

    internal fun toggleApproveMemberPostEvent(isChecked: Boolean) {
        viewModel.toggleDecision(
            isChecked = isChecked,
            turnOffEvent = {
                viewModel.turnOff(
                    onError = {
                        viewModel.revertToggleState()
                        errorDialog(
                            title = R.string.amity_unable_turn_off_post_review_title,
                            description = R.string.amity_something_went_wrong_pls_try
                        )
                    }
                )
                    .untilLifecycleEnd(this)
                    .subscribe()
            },
            turnOnEvent = {
                viewModel.turnOn(
                    onError = {
                        viewModel.revertToggleState()
                        errorDialog(
                            title = R.string.amity_unable_turn_on_post_review_title,
                            description = R.string.amity_something_went_wrong_pls_try
                        )
                    })
                    .untilLifecycleEnd(this)
                    .subscribe()
            })
    }

    private fun setupPostReviewListRecyclerView() {
        rvPostReview.layoutManager = LinearLayoutManager(context)
        rvPostReview.adapter = settingsListAdapter
        getPostReviewItems()
    }

    private fun getPostReviewItems() {
        viewModel.getSettingsItems(
            menuCreator = AmityPostReviewSettingsSettingsMenuCreatorImpl(this),
            onResult = this::renderItems
        )
            .untilLifecycleEnd(this)
            .subscribe()
    }

    private fun renderItems(items: List<AmitySettingsItem>) {
        settingsListAdapter.setItems(items)
    }
    
    private fun errorDialog(title: Int, description: Int) {
        AmityAlertDialogUtil.showDialog(requireContext(),
            getString(title),
            getString(description),
            getString(R.string.amity_ok),
            null
        ) { dialog, which ->
            AmityAlertDialogUtil.checkConfirmDialog(
                isPositive = which, confirmed = dialog::cancel
            )
        }
    }

    class Builder internal constructor() {
        private var communityId: String? = null

        internal fun communityId(id: String): Builder {
            communityId = id
            return this
        }

        fun build(activity: AppCompatActivity): AmityPostReviewSettingsFragment {
            val viewModel = ViewModelProvider(activity).get(AmityPostReviewSettingsViewModel::class.java)
            viewModel.communityId = communityId
            return AmityPostReviewSettingsFragment()
        }
    }

}