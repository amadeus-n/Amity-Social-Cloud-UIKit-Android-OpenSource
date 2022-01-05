// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.detailpage.EkoCommunityDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityActivityCommunityDetailBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @Bindable
  protected EkoCommunityDetailViewModel mViewModel;

  protected AmityActivityCommunityDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
  }

  public abstract void setViewModel(@Nullable EkoCommunityDetailViewModel viewModel);

  @Nullable
  public EkoCommunityDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityActivityCommunityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_activity_community_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityActivityCommunityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityActivityCommunityDetailBinding>inflateInternal(inflater, R.layout.amity_activity_community_detail, root, attachToRoot, component);
  }

  @NonNull
  public static AmityActivityCommunityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_activity_community_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityActivityCommunityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityActivityCommunityDetailBinding>inflateInternal(inflater, R.layout.amity_activity_community_detail, null, false, component);
  }

  public static AmityActivityCommunityDetailBinding bind(@NonNull View view) {
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
  public static AmityActivityCommunityDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityActivityCommunityDetailBinding)bind(component, view, R.layout.amity_activity_community_detail);
  }
}