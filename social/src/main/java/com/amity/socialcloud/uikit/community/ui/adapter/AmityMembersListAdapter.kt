package com.amity.socialcloud.uikit.community.ui.adapter

import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amity.socialcloud.sdk.core.user.AmityUser
import com.amity.socialcloud.uikit.common.base.AmityBaseRecyclerViewPagedAdapter
import com.amity.socialcloud.uikit.community.R
import com.amity.socialcloud.uikit.community.ui.clickListener.AmitySelectMemberListener
import com.amity.socialcloud.uikit.community.ui.viewHolder.AmityMemberListHeaderViewHolder
import com.amity.socialcloud.uikit.community.ui.viewHolder.AmityMemberListItemViewHolder
import com.amity.socialcloud.uikit.community.ui.viewModel.AmitySelectMembersViewModel

class AmityMembersListAdapter(
    private val listener: AmitySelectMemberListener,
    private val viewModel: AmitySelectMembersViewModel
) :
    AmityBaseRecyclerViewPagedAdapter<AmityUser>(diffCallback) {

    private val selectedMemberSet = HashSet<String>()

    companion object {

        private val diffCallback = object : DiffUtil.ItemCallback<AmityUser>() {
            override fun areItemsTheSame(oldItem: AmityUser, newItem: AmityUser): Boolean =
                oldItem.getUserId() == newItem.getUserId()

            override fun areContentsTheSame(oldItem: AmityUser, newItem: AmityUser): Boolean {
                return oldItem.getUserId() == newItem.getUserId()
                        && oldItem.getDisplayName() == newItem.getDisplayName()
            }
        }
    }

    override fun getLayoutId(position: Int, user: AmityUser?): Int {
        return if (position == 0 && user != null) {
            viewModel.memberMap[user.getUserId()] = position
            R.layout.amity_item_header_select_member
        } else {
            if (user == null) {
                R.layout.amity_item_select_member
            } else {
                viewModel.memberMap[user.getUserId()] = position
                val prevUser = getItem(position - 1)
                val currentUserDisplayName = user.getDisplayName() ?: ""
                val prevUserDisplayName = prevUser?.getDisplayName() ?: ""
                if (currentUserDisplayName.isEmpty() && prevUserDisplayName.isEmpty()) {
                    R.layout.amity_item_select_member
                } else if (currentUserDisplayName.isNotEmpty() && prevUserDisplayName.isEmpty()) {
                    R.layout.amity_item_header_select_member
                } else {
                    if (currentUserDisplayName[0].equals(prevUserDisplayName[0], true)
                    ) {
                        R.layout.amity_item_select_member
                    } else {
                        R.layout.amity_item_header_select_member
                    }
                }
            }

        }
    }

    override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.amity_item_header_select_member -> AmityMemberListHeaderViewHolder(
                view,
                listener,
                selectedMemberSet
            )
            else -> AmityMemberListItemViewHolder(view, listener, selectedMemberSet)
        }
    }

    fun submitPagedList(pagedList: PagedList<AmityUser>?, memberSet: HashSet<String>) {
        selectedMemberSet.clear()
        selectedMemberSet.addAll(memberSet)
        super.submitList(pagedList)
    }

    fun notifyChange(position: Int, memberSet: HashSet<String>) {
        selectedMemberSet.clear()
        selectedMemberSet.addAll(memberSet)
        super.notifyItemChanged(position)
    }

}