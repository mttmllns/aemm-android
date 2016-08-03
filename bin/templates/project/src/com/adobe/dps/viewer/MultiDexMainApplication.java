package com.adobe.dps.viewer;

import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by mmullins on 8/2/16.
 */
public class MultiDexMainApplication extends MainApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
