package com.atguigu.gulimall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author xiansen
 * @email xiansen@gmail.com
 * @date 2022-08-18 15:02:40
 */

public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

