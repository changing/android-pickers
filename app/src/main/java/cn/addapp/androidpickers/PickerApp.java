package cn.addapp.androidpickers;

import android.app.Application;

import cn.addapp.pickers.common.AppConfig;
import cn.addapp.pickers.util.LogUtils;
import cn.addapp.pickers.wheelpicker.BuildConfig;

/**
 * Author:matt : addapp.cn
 * DateTime:2016/7/20 20:28
 */
public class PickerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.setIsDebug(BuildConfig.DEBUG);
        if (!LogUtils.isDebug()) {
            android.util.Log.d(AppConfig.DEBUG_TAG, "logcat is disabled");
        }
    }

}
