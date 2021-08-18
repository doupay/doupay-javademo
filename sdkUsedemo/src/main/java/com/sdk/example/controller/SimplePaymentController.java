package com.sdk.example.controller;

import com.sdk.example.common.DouPayResp;
import com.sdk.example.dto.req.OrderCancelReq;
import com.sdk.example.dto.req.OrderInfoReq;
import com.sdk.example.dto.req.PaymentInfoReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.doupay.sdk.GetPaymentInfo;
import me.doupay.sdk.PaymentInfo;
import me.doupay.sdk.bean.OrderInfoResponseData;
import me.doupay.sdk.bean.PayResponseData;
import me.doupay.sdk.bean.PaymentCallBackResponse;
import me.doupay.sdk.bean.PaymentInfoResponseData;
import me.doupay.sdk.net.BaseVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@Api(value = "获取信息", tags = "获取信息")
@RequestMapping("/openAPI")
public class SimplePaymentController {

    @ApiOperation(value = "取消下单", notes = "取消下单")
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    public DouPayResp<PayResponseData> cancelOrder(@RequestBody OrderCancelReq orderCancelReq) {
        InitTools.init();
        BaseVo<PayResponseData> baseVo = GetPaymentInfo.cancleOrder(orderCancelReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @ApiOperation(value = "获取订单信息", notes = "获取订单信息")
    @RequestMapping(value = "/getOrderInfo", method = RequestMethod.POST)
    public DouPayResp<OrderInfoResponseData> getOrderInfo(@RequestBody OrderInfoReq orderInfoReq) {
        InitTools.init();
        BaseVo<OrderInfoResponseData> baseVo = GetPaymentInfo.getOrderInfo(orderInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/getPaymentInfo", method = RequestMethod.POST)
    @ApiOperation(value = "获取支付信息", notes = "获取支付信息")
    public DouPayResp<PaymentInfoResponseData> getPaymentInfo(@RequestBody PaymentInfoReq paymentInfoReq) {
        InitTools.init();
        BaseVo<PaymentInfoResponseData> baseVo = GetPaymentInfo.getPaymentInfo(paymentInfoReq.getCoinName(), paymentInfoReq.getChainCoinCode(), paymentInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }


    @RequestMapping(value = "/getCallback", method = RequestMethod.POST)
    @ApiOperation(value = "查询回调", notes = "查询回调")
    public DouPayResp<PaymentCallBackResponse> getCallback(@RequestBody @Valid OrderInfoReq orderInfoReq) {
        InitTools.init();
        BaseVo<PaymentCallBackResponse> baseVo = GetPaymentInfo.getCallback(orderInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }
}
