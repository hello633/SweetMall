package com.mycompany.sweetmall.order.dao;

import com.mycompany.sweetmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:15:40
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
