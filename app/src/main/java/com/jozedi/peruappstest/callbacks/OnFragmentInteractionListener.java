package com.jozedi.peruappstest.callbacks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

public interface OnFragmentInteractionListener {

    void onAddFragmentToStack(@Nullable View view, @NonNull Fragment fragment, CharSequence title,
                              boolean replaceFragment, boolean addToBackStack, boolean withAnimation,
                              @Nullable String tag);

    void onRemoveFragmentToStack(@Nullable View view);
}
