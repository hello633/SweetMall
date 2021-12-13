package com.mycompany.sweetmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.product.entity.AttrEntity;
import com.mycompany.sweetmall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 00:19:23
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId);

}

