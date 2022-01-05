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
import androidx.recyclerview.widget.RecyclerView;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.members.EkoCommunityMembersViewModel;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityFragmentMembersBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText etSearch;

  @NonNull
  public final RecyclerView rvCommunityMembers;

  @Bindable
  protected EkoCommunityMembersViewModel mViewModel;

  protected AmityFragmentMembersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText etSearch, RecyclerView rvCommunityMembers) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etSearch = etSearch;
    this.rvCommunityMembers = rvCommunityMembers;
  }

  public abstract void setViewModel(@Nullable EkoCommunityMembersViewModel viewModel);

  @Nullable
  public EkoCommunityMembersViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityFragmentMembersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_members, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentMembersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentMembersBinding>inflateInternal(inflater, R.layout.amity_fragment_members, root, attachToRoot, component);
  }

  @NonNull
  public static AmityFragmentMembersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_members, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentMembersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentMembersBinding>inflateInternal(inflater, R.layout.amity_fragment_members, null, false, component);
  }

  public static AmityFragmentMembersBinding bind(@NonNull View view) {
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
  public static AmityFragmentMembersBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityFragmentMembersBinding)bind(component, view, R.layout.amity_fragment_members);
  }
}