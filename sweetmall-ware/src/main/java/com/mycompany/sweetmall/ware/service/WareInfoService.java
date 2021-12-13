package com.mycompany.sweetmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.sweetmall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 17:25:04
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

