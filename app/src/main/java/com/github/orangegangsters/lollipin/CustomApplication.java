package com.github.orangegangsters.lollipin;

import android.app.Application;

import com.github.orangegangsters.lollipin.lib.managers.LockManager;

import lollipin.orangegangsters.github.com.lollipin.R;

/**
 * Created by oliviergoutay on 1/14/15.
 */
public class CustomApplication extends Application {

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate() {
        super.onCreate();

        LockManager<CustomRxPinActivity> lockManager = LockManager.getInstance();
        lockManager.enableAppLock(this, CustomRxPinActivity.class);
        lockManager.getAppLock().setLogoId(R.drawable.security_lock);
    }
}
