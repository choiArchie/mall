package com.ex.mall.coupon.dao;

import com.ex.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 14:02:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
