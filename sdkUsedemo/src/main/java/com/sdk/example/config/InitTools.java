package com.sdk.example.config;

import me.doupay.sdk.Constants;
import me.doupay.sdk.net.Language;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitTools {

    @Value("${doupay.api.appid}")
    private String appId;
    @Value("${doupay.api.secret}")
    private String secret;

    @Value("${doupay.api.privateKey}")
    private String privateKey;

    @Value("${doupay.api.publicKey}")
    private String publicKey;

    @Value("${doupay.api.expireTime}")
    private String expireTime;
    @Value("${doupay.api.sysLog}")
    private  Boolean sysLog;
    @Value("${doupay.api.url}")
    private String url;
    @Bean
    public  void init() {
        Constants.openSysLog =sysLog;
        Constants.getInstance().init(secret,privateKey,publicKey,appId,expireTime);
        Constants.setLanguage(Language.zh_TW);
        Constants.setBasrUrl(url);
    }

}
