package com.ylcf;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.ylcf.BaiduLBS;


class AnExampleReactPackage implements ReactPackage {


    @Override    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {       
    List<ViewManager> managers = new ArrayList<>();
  
        return managers;
    }

    @Override    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new BaiduLBS(reactContext));
                return modules;
    }
}
