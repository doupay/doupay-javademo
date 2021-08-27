package com.sdk.example;

import com.alibaba.fastjson.JSONObject;
import com.sdk.example.common.DouPayResp;
import com.sdk.example.utils.OrderCodeUtil;
import io.swagger.annotations.ApiOperation;
import me.doupay.sdk.PaymentInfo;
import me.doupay.sdk.bean.*;
import me.doupay.sdk.net.BaseVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void getCoinList() {
        String orderNo=OrderCodeUtil.getOrderCode("test");
        BaseVo<PayResponseData> pay =PaymentInfo.pay("10", null,
                CoinNameEnum.ETH, CurrencyCodeEnum.CNY, "1", orderNo, "标题123123211", null,
                "测试下单123123212132", OrderTypeCodeEnum.BY_MONEY);
        System.out.println(JSONObject.toJSONString(pay));

    }

}
