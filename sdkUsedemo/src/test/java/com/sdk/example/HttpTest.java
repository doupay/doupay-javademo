package com.sdk.example;

import me.doupay.sdk.Constants;
import me.doupay.sdk.PaymentInfo;
import me.doupay.sdk.bean.*;
import me.doupay.sdk.interfaceCallback.CallBackListener;
import me.doupay.sdk.net.BaseVo;
import me.doupay.sdk.net.ServerApi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Call;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class HttpTest {


    @Test
    public void getCoinList() {
        Map<String, Object> map = new HashMap<>();
        map.put("test", "test");
        Call<BaseVo<CoinResponseData>> baseVoCall = ServerApi.SERVICE_API.getCoinList(Constants.basrUrl + "trade/getCoinList", map);
        try {
            BaseVo<CoinResponseData> baseVo = baseVoCall.execute().body();
            if (baseVo.getCode() == 200) {
                System.out.println("-------------------------" + baseVo.getData().toString());
            } else {
                System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
            }
        } catch (Exception e) {
            System.out.println("-------------------------" + e.getMessage());

        }


    }

    @Test
    public void getCurrencyList() {


        BaseVo<CurrencyResponseData> baseVo = PaymentInfo.getCurrencyList();
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        } else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPay() {

        String orderNo = "SJDD" + String.valueOf(System.currentTimeMillis());


        Map<String, Object> map = new HashMap<>();
        map.put("appId", Constants.getAppId());
//        map.put("expireTime",Constants.getExpireTime());
//        map.put("merchantUser","123123");
        map.put("orderNo", orderNo);
        map.put("orderType", "BY_MONEY");
        map.put("subject", "买买买买迈阿密");
////        map.put("body","3234");
//        map.put("description","我要买买买买买买啊啊啊啊");
        map.put("money", "100");
        map.put("currency", "cny");
//        map.put("amount","100");
//        map.put("coinName","USDT");

        Call<BaseVo<PayResponseData>> gotoPay = ServerApi.SERVICE_API.gotoPay(Constants.basrUrl + "trade/pay", map);
        try {
            BaseVo<PayResponseData> responseBody = gotoPay.execute().body();
            if (responseBody.getCode() == 200) {
                System.out.println(responseBody.getData().toString());
            } else {
                System.out.println(responseBody.getMsg());
            }
        } catch (Exception e) {
            System.out.println("网络请求报错:" + e.getMessage());
        }
    }

    @Test
    public void cancle() {


        Map<String, Object> map = new HashMap<>();
        map.put("orderCode", "ZF202108131359385329626349");
//        map.put("test","test");

        Call<BaseVo<PayResponseData>> baseVoCall = ServerApi.SERVICE_API.cancleOrder(Constants.basrUrl + "trade/cancel", map);
        try {
            BaseVo<PayResponseData> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getOrderInfo() {

        Map<String, Object> map = new HashMap<>();
        map.put("orderCode", "");
        Call<BaseVo<OrderInfoResponseData>> orderInfo = ServerApi.SERVICE_API.getOrderInfo(Constants.basrUrl + "trade/getOrderInfo", map);
        try {
            BaseVo<OrderInfoResponseData> body = orderInfo.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getPaymentInfo() {


        Map<String, Object> map = new HashMap<>();
        map.put("coinName", "");
        map.put("orderCode", "");
        map.put("chainCoinCode", "");
        Call<BaseVo<PaymentInfoResponseData>> paymentInfo = ServerApi.SERVICE_API.getPaymentInfo(Constants.basrUrl + "trade/getPaymentInfo", map);
        try {
            BaseVo<PaymentInfoResponseData> body = paymentInfo.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getRefund() {

        String appId = Constants.getAppId();
        String timestamp = System.currentTimeMillis() + "";
        Map<String, Object> map = new HashMap<>();
        map.put("refundType", "OLD_ADDRESS");
        map.put("remark", "1212");
        map.put("amount", "111");
        map.put("appId", appId);
        map.put("orderCode", "ZF202108131359385329626349");
        map.put("timeStamp", timestamp);
//        map.put("address","111");

        Call<BaseVo<RefundResponseData>> baseVoCall = ServerApi.SERVICE_API.gotoRefund(Constants.basrUrl + "trade/refund", map);
        try {
            BaseVo<RefundResponseData> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getRefundInfo() {


        Map<String, Object> map = new HashMap<>();
        map.put("orderCode", "");

        Call<BaseVo<RefundInfoResponseData>> baseVoCall = ServerApi.SERVICE_API.getRefundInfo(Constants.basrUrl + "trade/getRefunds", map);
        try {
            BaseVo<RefundInfoResponseData> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void withdraw() {

        Map<String, Object> map = new HashMap<>();

//        map.put("amount","11");
        map.put("money", "100");
//        map.put("currency","");
        String appId = Constants.getAppId();
        map.put("address", "TEQrvHyU54YibVHMGb7475n8y3mXBofaaR");
        map.put("appId", appId);
        map.put("coinName", "USDT");
        map.put("merchantUser", "1");
        map.put("orderNo", "ZF20210813135938532962634911");
        map.put("timeStamp", "" + System.currentTimeMillis());
        map.put("orderType", "BY_MONEY");
        map.put("protocolName", "TRC20");
        Call<BaseVo<WithdrawResponse>> baseVoCall = ServerApi.SERVICE_API.withdraw(Constants.basrUrl + "trade/withdrawal", map);
        try {
            BaseVo<WithdrawResponse> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void makeup() {

        Map<String, Object> map = new HashMap<>();
        map.put("orderCode", "ZF202108131359385329626349");
        map.put("appId", Constants.getAppId());
        map.put("remark", "aaaaaa");
        map.put("timeStamp", System.currentTimeMillis());
        Call<BaseVo<MakeUpResponse>> baseVoCall = ServerApi.SERVICE_API.makeup(Constants.basrUrl + "trade/makeUpOrder", map);
        try {
            BaseVo<MakeUpResponse> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void getPrice() {

        Map<String, Object> map = new HashMap<>();
        map.put("coinName", "USDT");
        map.put("currency", "qqq");

        Call<BaseVo<CoinPriceResponse>> baseVoCall = ServerApi.SERVICE_API.getPrice(Constants.basrUrl + "trade/getCurrencyCoinPrice", map);
        try {
            BaseVo<CoinPriceResponse> body = baseVoCall.execute().body();
            if (body.getCode() == 200) {
                System.out.println(body.getData().toString());
            } else {
                System.out.println(body.getMsg());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void verifySignAndGetResult() {


        String bodystring = "{\"address\":\"TQ1EgPhuDXLvDfycCBQadbfbLkBPhEDoZX\",\"amountPaid\":\"15.26717557\",\"coinName\":\"USDT\",\"orderCode\":\"ZF202106221133335640422688\",\"paymentStatus\":1,\"protocolName\":\"TRC20\",\"result\":true}";
        String headstring = "uCJasnGz3H+2Xi86zeRkoDVEaXpM0LsCInOW1Kk28pn/3bXMn/2vUac7aQrWUzcf8YjTiXJt03IzS6k0y04TsvL1rdOj7TZgrk2aav8wM79ECviDW1+OQWd2XRhCRJGL4ca5lnXiE+1eHV5Tdq68Nu50tOkTKGI6cD3LT6imEWq5bTB0I+xuabnhSDfhWdmogmzEwKju3xSPcjxtzHGJ/c8Zc1NYH7ID92qWi77Wm6/UskHiATgULXYCbLHL/hBFDn4kGH8E+FQ0oSoPOTLOvpKnI27v6xD7CyHhMUOYRaVm5u/X4YNta65hF//JVPLnMw8I9NJA9WklDPFZ1DvIQQ==";
        PaymentInfo.verifySignAndGetResult(headstring, bodystring, new CallBackListener<PaymentCallBackResponse>() {
            @Override
            public void onFinish(PaymentCallBackResponse data) {
                System.out.println("PaymentResultResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);

            }
        }, new CallBackListener<UserWithdrawCallBackResponse>() {
            @Override
            public void onFinish(UserWithdrawCallBackResponse data) {
                System.out.println("UserWithdrawCallBackResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);
            }
        }, new CallBackListener<MakeUpCallBackResponse>() {
            @Override
            public void onFinish(MakeUpCallBackResponse data) {
                System.out.println("UserWithdrawCallBackResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);
            }
        });
    }

    @Test
    public void getBillRecord() {

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now();
//        PaymentInfo.getBillRecords( null, null, 10, 1, new CallBackListener<BillRecord>() {
//            @Override
//            public void onFinish(BillRecord data) {
//
//            }
//
//            @Override
//            public void onError(int errorCode, String msg) {
//
//            }
//        });
    }

}
