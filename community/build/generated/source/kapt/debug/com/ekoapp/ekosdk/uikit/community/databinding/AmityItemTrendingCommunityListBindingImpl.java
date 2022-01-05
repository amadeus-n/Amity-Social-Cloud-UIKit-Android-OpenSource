package com.ekoapp.ekosdk.uikit.community.databinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AmityItemTrendingCommunityListBindingImpl extends AmityItemTrendingCommunityListBinding implements com.ekoapp.ekosdk.uikit.community.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvCount, 6);
        sViewsWithIds.put(R.id.communityNameContainer, 7);
        sViewsWithIds.put(R.id.flow, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AmityItemTrendingCommunityListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AmityItemTrendingCommunityListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[7]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[8]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.ivAvatar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCategory.setTag(null);
        this.tvCommName.setTag(null);
        this.tvDot.setTag(null);
        this.tvMembersCount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.ekoapp.ekosdk.uikit.community.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ekoCommunity == variableId) {
            setEkoCommunity((com.ekoapp.ekosdk.community.EkoCommunity) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.ekoapp.ekosdk.uikit.community.mycommunity.listener.IMyCommunityItemClickListener) variable);
        }
        else if (BR.avatarUrl == variableId) {
            setAvatarUrl((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEkoCommunity(@Nullable com.ekoapp.ekosdk.community.EkoCommunity EkoCommunity) {
        this.mEkoCommunity = EkoCommunity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ekoCommunity);
        super.requestRebind();
    }
    public void setListener(@Nullable com.ekoapp.ekosdk.uikit.community.mycommunity.listener.IMyCommunityItemClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setAvatarUrl(@Nullable java.lang.String AvatarUrl) {
        this.mAvatarUrl = AvatarUrl;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.avatarUrl);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ekoapp.ekosdk.community.EkoCommunity ekoCommunity = mEkoCommunity;
        android.graphics.drawable.Drawable ekoCommunityOfficialTvCommNameAndroidDrawableAmityIcVerifiedJavaLangObjectNull = null;
        com.ekoapp.ekosdk.uikit.community.mycommunity.listener.IMyCommunityItemClickListener listener = mListener;
        java.lang.String avatarUrl = mAvatarUrl;
        java.lang.String ekoCommunityDisplayName = null;
        boolean ekoCommunityOfficial = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (ekoCommunity != null) {
                    // read ekoCommunity.displayName
                    ekoCommunityDisplayName = ekoCommunity.getDisplayName();
                    // read ekoCommunity.official
                    ekoCommunityOfficial = ekoCommunity.isOfficial();
                }
            if((dirtyFlags & 0x9L) != 0) {
                if(ekoCommunityOfficial) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read ekoCommunity.official ? @android:drawable/amity_ic_verified : null
                ekoCommunityOfficialTvCommNameAndroidDrawableAmityIcVerifiedJavaLangObjectNull = ((ekoCommunityOfficial) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvCommName.getContext(), R.drawable.amity_ic_verified)) : (null));
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setImageUrl(this.ivAvatar, avatarUrl, androidx.appcompat.content.res.AppCompatResources.getDrawable(ivAvatar.getContext(), R.drawable.amity_ic_default_community_avatar_small));
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setEkoViewBackgroundColor(this.ivAvatar, getColorFromResource(ivAvatar, R.color.amityColorPrimary), com.ekoapp.ekosdk.uikit.common.views.ColorShade.SHADE3);
            this.mboundView0.setOnClickListener(mCallback9);
            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setEkoTextColor(this.tvCategory, com.ekoapp.ekosdk.uikit.common.views.ColorShade.SHADE1, (com.ekoapp.ekosdk.uikit.common.views.ColorShade)null);
            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setEkoTextColor(this.tvDot, com.ekoapp.ekosdk.uikit.common.views.ColorShade.SHADE1, (com.ekoapp.ekosdk.uikit.common.views.ColorShade)null);
            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setEkoTextColor(this.tvMembersCount, com.ekoapp.ekosdk.uikit.common.views.ColorShade.SHADE1, (com.ekoapp.ekosdk.uikit.common.views.ColorShade)null);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.ekoapp.ekosdk.uikit.components.BindingUtilityKt.setText(this.tvCommName, ekoCommunityDisplayName);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.tvCommName, ekoCommunityOfficialTvCommNameAndroidDrawableAmityIcVerifiedJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // ekoCommunity
        com.ekoapp.ekosdk.community.EkoCommunity ekoCommunity = mEkoCommunity;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.ekoapp.ekosdk.uikit.community.mycommunity.listener.IMyCommunityItemClickListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.onCommunitySelected(ekoCommunity);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ekoCommunity
        flag 1 (0x2L): listener
        flag 2 (0x3L): avatarUrl
        flag 3 (0x4L): null
        flag 4 (0x5L): ekoCommunity.official ? @android:drawable/amity_ic_verified : null
        flag 5 (0x6L): ekoCommunity.official ? @android:drawable/amity_ic_verified : null
    flag mapping end*/
    //end
}