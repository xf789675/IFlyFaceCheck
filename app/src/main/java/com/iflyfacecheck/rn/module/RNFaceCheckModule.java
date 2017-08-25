package com.iflyfacecheck.rn.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/**
 * Created by xufeng on 25/08/2017.
 */

public class RNFaceCheckModule extends ReactContextBaseJavaModule {
  public RNFaceCheckModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "FaceCheck";
  }
}
