// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.community.membership.EkoCommunityMembership;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.members.IMemberClickListener;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemCommunityMembershipBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView ivAvatar;

  @NonNull
  public final ImageView ivMore;

  @NonNull
  public final TextView tvMemberName;

  @Bindable
  protected String mAvatarUrl;

  @Bindable
  protected Boolean mIsMyUser;

  @Bindable
  protected Boolean mIsJoined;

  @Bindable
  protected EkoCommunityMembership mCommunityMemberShip;

  @Bindable
  protected IMemberClickListener mListener;

  protected AmityItemCommunityMembershipBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ShapeableImageView ivAvatar, ImageView ivMore, TextView tvMemberName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivAvatar = ivAvatar;
    this.ivMore = ivMore;
    this.tvMemberName = tvMemberName;
  }

  public abstract void setAvatarUrl(@Nullable String avatarUrl);

  @Nullable
  public String getAvatarUrl() {
    return mAvatarUrl;
  }

  public abstract void setIsMyUser(@Nullable Boolean isMyUser);

  @Nullable
  public Boolean getIsMyUser() {
    return mIsMyUser;
  }

  public abstract void setIsJoined(@Nullable Boolean isJoined);

  @Nullable
  public Boolean getIsJoined() {
    return mIsJoined;
  }

  public abstract void setCommunityMemberShip(@Nullable EkoCommunityMembership communityMemberShip);

  @Nullable
  public EkoCommunityMembership getCommunityMemberShip() {
    return mCommunityMemberShip;
  }

  public abstract void setListener(@Nullable IMemberClickListener listener);

  @Nullable
  public IMemberClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static AmityItemCommunityMembershipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_membership, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityMembershipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityMembershipBinding>inflateInternal(inflater, R.layout.amity_item_community_membership, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemCommunityMembershipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_membership, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityMembershipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityMembershipBinding>inflateInternal(inflater, R.layout.amity_item_community_membership, null, false, component);
  }

  public static AmityItemCommunityMembershipBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AmityItemCommunityMembershipBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityItemCommunityMembershipBinding)bind(component, view, R.layout.amity_item_community_membership);
  }
}