package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.bean.CoinNameEnum;

@Data
public class CoinChainCodeReq {
    @ApiModelProperty(value = "币种")
    private CoinNameEnum coinName;
}
