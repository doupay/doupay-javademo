package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.bean.CoinNameEnum;
import me.doupay.sdk.bean.CurrencyCodeEnum;
import me.doupay.sdk.bean.OrderTypeCodeEnum;

@Data
public class CoinPriceReq {
    @ApiModelProperty(value = "法币")
    private CurrencyCodeEnum currency;
    @ApiModelProperty(value = "币种")
    private CoinNameEnum coinName;

}
