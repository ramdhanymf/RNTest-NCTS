package com.rntestncts.HelloWorldModule;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.example.helloworldaar.WorldMe;

public class HelloWorldModule extends ReactContextBaseJavaModule {
    
    private ReactContext reactContext;

    public HelloWorldModule(ReactApplicationContext reactContext){
        super(reactContext);
        this.reactContext=reactContext;
    }

    @Override
    public String getName() {
        return "HelloWorldModule";
    }

    @ReactMethod
    public void print(String val) {
       WorldMe printingOriginal = new WorldMe();

       WorldMe.print(val);
       printingOriginal.printFromInstance(val);
    }
}

