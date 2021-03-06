package com.ex.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex.common.utils.PageUtils;
import com.ex.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-14 15:39:35
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

