package com.ex.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex.common.utils.PageUtils;
import com.ex.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 14:43:04
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

