package com.mycompany.sweetmall.ware.dao;

import com.mycompany.sweetmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:25:04
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
