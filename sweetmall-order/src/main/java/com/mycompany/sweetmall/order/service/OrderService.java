package com.mycompany.sweetmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:15:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

