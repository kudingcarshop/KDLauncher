package com.kuding.kdlauncher;

import android.app.Activity;

import com.alibaba.sdk.android.man.MANService;
import com.alibaba.sdk.android.man.MANServiceProvider;

import java.util.Map;

public class ManServiceManager {

    public static final String ACTION = "action";
    public static final String INTENT = "intent";

    public static void updatePageProperties(Map<String, String> map) {
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().updatePageProperties(map);
    }

    public static void pageAppear(Activity activity) {
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().pageAppear(activity);
    }

    public static void pageDisAppear(Activity activity) {
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().pageDisAppear(activity);
    }
}
