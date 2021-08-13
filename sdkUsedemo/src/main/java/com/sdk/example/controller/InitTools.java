package com.sdk.example.controller;

import me.doupay.sdk.Constants;
import me.doupay.sdk.net.Language;

public class InitTools {


    public static void init() {
        String appId = "doupay_n62mewaVa9";
        String secret = "cff7d04980ff1a720c8e8f61c73d4073";
        String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC2i06su2Hctp/L\n" +
                "cI0fsTUtO69J8LOoFI9xp3msU0LrcGbw3hXkL4kSxqCbwREmhkHD45/PFl84XVVC\n" +
                "Q9Fkkpln9fxIqnL2zLdaSy6rI+fbg/l7Rpz2HamzocYw9AXAUoVtkDajYJC/SmqT\n" +
                "fTeq18zx5eSQD3syPlMUQFRlq5lnYF0TLmtZbhlVu9XPsTkE0yOd4n2TpOr6ZXDH\n" +
                "rz1dzWwN2REFBV4aUXQGjR4BEyv67V6WuO4fJXHGM6ovBlH+sIyJ0g3glsN8tLBA\n" +
                "XssLYHkbwX319jJa6alQldFCWz+HanbHn1SRK1rZBSt9a7wc2b5cgo4RI69eF9XE\n" +
                "PWKG/zzPAgMBAAECggEBAI6r9sO+eNBe1CnXQBWjFSLTYT9zJ5eY6jw0Xz62nLkT\n" +
                "UwGzMnz0Qjgwklrp3RO1HzWRdNgQbj/JgteV1dS7V7cPZS0OO2h1vGCQHluYZqEF\n" +
                "VzpoiEk8CeTh7dtY/h3A4ZQugOXUlY1NBltcJOQcYow12BxYXTt5xskvNkd4hR9r\n" +
                "uFhINtksfKvq/jdHJVis5t+4phUdeyYeE4CwFGGeBgwxMu/LkGNGU/zUQ1Kl7PZN\n" +
                "TyEKm5uhzglV8nKvRc04FGOJcHi2jU98/nqBGnnrybqHaGfPO9BdmaVc9t5KI0Dq\n" +
                "LrQKyGlT4UowUYW/6BU5KVuICfYZUXIrr7SMYakzc+ECgYEA7BbbC+EbmYJDuAMu\n" +
                "HA5sDBV2y5ZIZ/+ljLFvL2tA8jFb2qbdgPQVkTX8TgUvA3oisq7i5Maps+KE/y1Z\n" +
                "8Oaz4kg+nRiZQ3ms5JYHhAKZdFcm1Cf3n0ge09t6J/HqYClVdQfqOgmKjYJZ8CCN\n" +
                "YsVIduK65EAVDo/YfMWYYxHllwcCgYEAxfBrAdLER/zu3V1+ONyFx+8ZVOafkk4O\n" +
                "wkwwanWPd2a5NgDDaoY/xJylkBEdqlstLpkC4k0cdt/LRts9w63LDu9P6Na/r726\n" +
                "jIZokK1yAcSHTATVKgfR6STo0nNFWn/Uk5CpBD0jgLsq6yB8wwLRVCqyaj5GGLoH\n" +
                "zVfyGoxBMfkCgYAzPJaXUmhZ/WJS+iW0oxCh4rqgXmIiZ+H20b8ujFlQ9pNXtaUW\n" +
                "ymIv3IaALDHS0FvdaYUGX3MO/hcdBiuh03+wmTs1ftQsR6jVBxZkeOfyzsM3geEE\n" +
                "qXM/ST+Okbrq2a2ZM3mK1O1D3slECtyEVgpu+q/Sv3GScndqRLvYrFamWwKBgBmf\n" +
                "ufqOcmJvV+zIQaLSyW7MgRcAk/+4oyh7/HiLp3rpjWh0SNftcSveq4Au9wwqqXqy\n" +
                "zDDHkrvA1OvjTeebBAJ28H1P75iskw3GCJtSGMQp0OoCZiX+xSnNYWZ9DaldiwNf\n" +
                "YsHtuD7d+/xcREpqfvbKYDZowWJKEuB+VhUhuv7hAoGAZssteG/Nsv8xxI36A5qK\n" +
                "sQkFM+OX3RtbtOsBN07/ynEcKqs03u1c53Q81xdVTmCLvC87cGYv14sPzbReSB3K\n" +
                "BU3AY9JVRJGpuQkAhY85gj6LLCqpzw2GGfNQK875tJy7VyKcMtOQ5XOmdAYLTi4q\n" +
                "QYbWcXx9Zv1w2ezKZE8EFG8=";
        String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhl7C2UAO1DZYOYLK+6IN5zez+WOFpGiAeGjToLXVkPtVKY0iKR+sZIXvx1FdszQOaIDkPlHgbisi5HYoWayQ8Hj2+NylQ1pBz+xek/fl9DKpIb3jKrlZBI4jnkNNQTx2guGVM9BbnQBE52OMf4hB3OfCFpPDyuc5tEE10rZtYRNYbdGeR4xgm0esZYyS6CfwZ275mbcTxnHsa09xghsL5qQi+bwDvSOp9SKiCx4p79rtxhgQrBVCCFxP39E/RhSSeCh9iWwCL6kMEQYNEJHGWWCV1WDnJHIjjwIzoN/vSKXxFdjw1tigq8owNd0v3cffMOnYBLNiYtsFhswGB0t9CQIDAQAB";
        Constants.openSysLog = true;
        Constants.getInstance().init(secret,privateKey,publicKey,appId,"3600");
        Constants.setLanguage(Language.zh_CH);
        Constants.setBasrUrl("http://192.168.11.113:9000/");
    }

}
