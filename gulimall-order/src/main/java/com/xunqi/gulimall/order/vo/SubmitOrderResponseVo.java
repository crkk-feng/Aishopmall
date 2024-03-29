package com.xunqi.gulimall.order.vo;

import com.xunqi.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: Crkkk
 * @createTime: 2022-07-04 22:34
 **/

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;


}
