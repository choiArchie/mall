package com.ex.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex.common.utils.PageUtils;
import com.ex.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 14:02:19
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

