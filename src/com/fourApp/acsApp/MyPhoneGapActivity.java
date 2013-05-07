package com.fourApp.acsApp;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		
		super.setIntegerProperty("splashscreen", R.drawable.fourapps_logo);
		super.loadUrl(Config.getStartUrl(), 10000);
	}
}
