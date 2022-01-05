// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.community.category.EkoCommunityCategory;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.explore.listener.IEkoCategoryItemClickListener;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemCommunityCategoryBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView ivAvatar;

  @Bindable
  protected EkoCommunityCategory mCommunityCategory;

  @Bindable
  protected IEkoCategoryItemClickListener mListener;

  @Bindable
  protected String mAvatarUrl;

  protected AmityItemCommunityCategoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ShapeableImageView ivAvatar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivAvatar = ivAvatar;
  }

  public abstract void setCommunityCategory(@Nullable EkoCommunityCategory communityCategory);

  @Nullable
  public EkoCommunityCategory getCommunityCategory() {
    return mCommunityCategory;
  }

  public abstract void setListener(@Nullable IEkoCategoryItemClickListener listener);

  @Nullable
  public IEkoCategoryItemClickListener getListener() {
    return mListener;
  }

  public abstract void setAvatarUrl(@Nullable String avatarUrl);

  @Nullable
  public String getAvatarUrl() {
    return mAvatarUrl;
  }

  @NonNull
  public static AmityItemCommunityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityCategoryBinding>inflateInternal(inflater, R.layout.amity_item_community_category, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemCommunityCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityCategoryBinding>inflateInternal(inflater, R.layout.amity_item_community_category, null, false, component);
  }

  public static AmityItemCommunityCategoryBinding bind(@NonNull View view) {
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
  public static AmityItemCommunityCategoryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityItemCommunityCategoryBinding)bind(component, view, R.layout.amity_item_community_category);
  }
}