/*******************************************************************************
 * Copyright 2015-2019 Toaker NewBeyondViewPager
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.toaker.newbeyondviewpager;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;

import com.toaker.common.tlog.TLog;

/**
 * Decorator for NewBeyondViewPager
 *
 * @author Toaker [Toaker](ToakerQin@gmail.com)
 *         [Toaker](http://www.toaker.com)
 * @Time Create by 2015/5/14 9:38
 */
public class NewBeyondViewPager extends ViewGroup {

    private static final boolean DEBUG = true;

    private static final String LOG_TAG = "NewBeyondViewPager:";

    public NewBeyondViewPager(Context context) {
        super(context);
    }

    public NewBeyondViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NewBeyondViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public NewBeyondViewPager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if(DEBUG){
            TLog.d(LOG_TAG,"onLayout: %s %s %s %s",l,t,r,b);
        }
    }
}
