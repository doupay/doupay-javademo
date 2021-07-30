package com.sdk.example.controller;

import me.doupay.sdk.Constants;

public class InitTools {


    public static void init() {
        String appId = "xxxx";
        String secret = "xxxx";
        String privateKey = "xxx";
        String publicKey = "xxxx";
        Constants.openSysLog = true;
        Constants.getInstance().init(secret,privateKey,publicKey,appId,"86400");
    }

}
