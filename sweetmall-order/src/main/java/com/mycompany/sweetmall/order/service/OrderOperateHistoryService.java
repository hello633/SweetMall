package com.mycompany.sweetmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:15:40
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

