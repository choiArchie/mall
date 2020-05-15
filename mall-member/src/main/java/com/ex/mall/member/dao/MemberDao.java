package com.ex.mall.member.dao;

import com.ex.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wancheng
 * @email choiarchie@163.com
 * @date 2020-05-15 14:35:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
