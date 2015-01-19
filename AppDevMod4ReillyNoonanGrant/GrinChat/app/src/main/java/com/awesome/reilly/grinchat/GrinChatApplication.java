package com.awesome.reilly.grinchat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by reilly on 1/18/15.
 */
public class GrinChatApplication extends Application {

    @Override
    public void onCreate() {
        Parse.initialize(this,"qb596dgvzP8wSC1C6HwKUUTgtDlxSoSGWEBiK6Tt","g6pjc58k5IoyioGC6O10y78UH5r2nBsNEDO6Hww7");


    }
}
