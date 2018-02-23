package com.lateroad.todo.adapter;

import android.view.View;

/**
 * Created by LateRoad on 23.02.2018.
 */

public interface ItemClickListener {
    void onClick(View view, int position, boolean isLongClick);
}
