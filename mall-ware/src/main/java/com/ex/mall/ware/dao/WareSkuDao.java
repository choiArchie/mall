package com.ex.mall.ware.dao;

import com.ex.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 23:01:17
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
