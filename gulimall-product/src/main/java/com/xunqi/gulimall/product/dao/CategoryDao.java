package com.xunqi.gulimall.product.dao;

import com.xunqi.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Crkkk
 * @email Crkkk@gulimall.com
 * @date 2022-11-20 19:00:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
