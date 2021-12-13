package com.mycompany.sweetmall.order.dao;

import com.mycompany.sweetmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:15:40
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
