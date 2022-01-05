// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.components.EkoToolBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEkoPushNotificationsSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final EkoToolBar pushNotificationToolBar;

  @NonNull
  public final AmityItemSeparateContentBinding separatorToolbar;

  private ActivityEkoPushNotificationsSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout fragmentContainer, @NonNull EkoToolBar pushNotificationToolBar,
      @NonNull AmityItemSeparateContentBinding separatorToolbar) {
    this.rootView = rootView;
    this.fragmentContainer = fragmentContainer;
    this.pushNotificationToolBar = pushNotificationToolBar;
    this.separatorToolbar = separatorToolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEkoPushNotificationsSettingsBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEkoPushNotificationsSettingsBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_eko_push_notifications_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEkoPushNotificationsSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentContainer;
      FrameLayout fragmentContainer = rootView.findViewById(id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.pushNotificationToolBar;
      EkoToolBar pushNotificationToolBar = rootView.findViewById(id);
      if (pushNotificationToolBar == null) {
        break missingId;
      }

      id = R.id.separatorToolbar;
      View separatorToolbar = rootView.findViewById(id);
      if (separatorToolbar == null) {
        break missingId;
      }
      AmityItemSeparateContentBinding binding_separatorToolbar = AmityItemSeparateContentBinding.bind(separatorToolbar);

      return new ActivityEkoPushNotificationsSettingsBinding((ConstraintLayout) rootView,
          fragmentContainer, pushNotificationToolBar, binding_separatorToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}