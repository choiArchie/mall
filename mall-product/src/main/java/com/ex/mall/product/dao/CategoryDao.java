package com.ex.mall.product.dao;

import com.ex.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-14 15:39:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
