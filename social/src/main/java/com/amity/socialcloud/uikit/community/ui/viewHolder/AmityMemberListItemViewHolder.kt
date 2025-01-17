package com.amity.socialcloud.uikit.community.ui.viewHolder

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.amity.socialcloud.sdk.AmityCoreClient
import com.amity.socialcloud.sdk.core.file.AmityImage
import com.amity.socialcloud.sdk.core.user.AmityUser
import com.amity.socialcloud.uikit.common.base.AmityBaseRecyclerViewPagedAdapter
import com.amity.socialcloud.uikit.common.components.setVisibility
import com.amity.socialcloud.uikit.community.R
import com.amity.socialcloud.uikit.community.databinding.AmityItemSelectMemberBinding
import com.amity.socialcloud.uikit.community.ui.clickListener.AmitySelectMemberListener

class AmityMemberListItemViewHolder(
    itemView: View,
    private val mClickListener: AmitySelectMemberListener,
    private val membersSet: HashSet<String>
) : RecyclerView.ViewHolder(itemView), AmityBaseRecyclerViewPagedAdapter.Binder<AmityUser> {

    private val binding: AmityItemSelectMemberBinding? = DataBindingUtil.bind(itemView)

    override fun bind(data: AmityUser?, position: Int) {
        if (data != null) {
            binding?.smTitle?.text = if (data.getDisplayName().isNullOrEmpty()) {
                itemView.context.getString(R.string.amity_anonymous)
            } else {
                data.getDisplayName()
            }
            binding?.avatarUrl = data.getAvatar()?.getUrl(AmityImage.Size.MEDIUM)
            binding?.smSubTitle?.text = ""
            binding?.ivStatus?.isChecked = membersSet.contains(data.getUserId())
            binding?.ivStatus?.setOnClickListener {
                mClickListener.onMemberClicked(data, position)
            }
            binding?.let {
                setVisibility(
                    it.ivStatus,
                    AmityCoreClient.getUserId() != data.getUserId()
                )
            }
        }
    }
}