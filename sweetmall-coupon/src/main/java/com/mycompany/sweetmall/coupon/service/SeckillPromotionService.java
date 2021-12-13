package com.mycompany.sweetmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 16:25:48
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

