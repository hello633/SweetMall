package com.mycompany.sweetmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:15:40
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

