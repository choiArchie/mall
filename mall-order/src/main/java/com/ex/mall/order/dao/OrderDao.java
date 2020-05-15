package com.ex.mall.order.dao;

import com.ex.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 14:43:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
