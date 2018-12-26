package com.jozedi.peruappstest.callbacks;

import android.view.View;

public interface OnClickListener<T> {
    boolean onItemClick(View view, T model, int position, boolean longPress);
}
