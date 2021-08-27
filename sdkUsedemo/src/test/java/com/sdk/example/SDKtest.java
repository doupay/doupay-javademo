package com.sdk.example;

import me.doupay.sdk.Constants;
import me.doupay.sdk.PaymentInfo;
import me.doupay.sdk.bean.*;
import me.doupay.sdk.enums.RefundType;
import me.doupay.sdk.interfaceCallback.CallBackListener;
import me.doupay.sdk.net.BaseVo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;



@SpringBootTest
public class SDKtest {



    @Test
    public void getCoinList () {
          

        BaseVo<CoinResponseData> baseVo = PaymentInfo.getCoinList();
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }


    }
    @Test
    public void getCurrencyList() {
          

        BaseVo<CurrencyResponseData> baseVo = PaymentInfo.getCurrencyList();
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPay() {
          
        String orderNo = "SJDD" + String.valueOf(System.currentTimeMillis());

        BaseVo<PayResponseData> baseVo = PaymentInfo.pay("","10", CoinNameEnum.USDT, CurrencyCodeEnum.USD, "", orderNo,
                "我要买买买", "", "", OrderTypeCodeEnum.BY_AMOUNT);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void cancle() {
          

        BaseVo<PayResponseData> baseVo =  PaymentInfo.cancleOrder("ZF202108190219318429919697");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getOrderInfo() {
          
        BaseVo<OrderInfoResponseData> baseVo = PaymentInfo.getOrderInfo("ZF202108180540250532839870");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPaymentInfo() {
          

        BaseVo<PaymentInfoResponseData> baseVo =  PaymentInfo.getPaymentInfo(CoinNameEnum.USDT,"0004" ,"ZF202108130826005085856666");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getRefund() {
          
        BaseVo<RefundResponseData> baseVo = PaymentInfo.refund(RefundType.NEW_ADDRESS,"TEQrvHyU54YibVHMGb7475n8y3mXBofaaR", "15.8", "ZF202108130826005085856666", "退1个,啦啦啦");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getRefundInfo() {
          

        BaseVo<RefundInfoResponseData> baseVo = PaymentInfo.getRefunds("ZF202107280739365664124421");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getCoinChainCodes() {
          

        BaseVo<CoinChainCodeResp> baseVo = PaymentInfo.getCoinChainCodes(CoinNameEnum.USDT);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void withdraw() {
          
        String orderNo = "SHYH" + String.valueOf(System.currentTimeMillis());
        BaseVo<WithdrawResponse> baseVo = PaymentInfo.withdraw("TRC20","TEQrvHyU54YibVHMGb7475n8y3mXBofaaR", "8", CoinNameEnum.USDT, orderNo, orderNo,"500",OrderTypeCodeEnum.BY_AMOUNT,CurrencyCodeEnum.CNY);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void makeup() {
          
        BaseVo<MakeUpResponse> baseVo = PaymentInfo.maleUp("需要补单","ZF202108130838338493182222");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getCallBack() {
          
        BaseVo<PaymentCallBackResponse> baseVo = PaymentInfo.getCallback("ZF202107221114581046391184");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPrice() {
          
        BaseVo<CoinPriceResponse> baseVo = PaymentInfo.getCoinPrice(CoinNameEnum.USDT,CurrencyCodeEnum.CNY);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void verifySignAndGetResult () {
          

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
    public void  getBillRecord () {
          
        LocalDateTime start =  LocalDateTime.now();
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
