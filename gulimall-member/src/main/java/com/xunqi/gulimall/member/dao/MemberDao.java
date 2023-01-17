package com.xunqi.gulimall.member.dao;

import com.xunqi.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Crkkk
 * @email Crkkk@gulimall.com
 * @date 2022-11-20 19:42:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
