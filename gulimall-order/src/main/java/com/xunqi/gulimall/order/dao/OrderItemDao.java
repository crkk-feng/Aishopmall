package com.xunqi.gulimall.order.dao;

import com.xunqi.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Crkkk
 * @email Crkkk@gulimall.com
 * @date 2022-11-20 19:49:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
