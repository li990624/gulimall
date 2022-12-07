package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiansen
 * @email xiansen@gmail.com
 * @date 2022-08-19 10:20:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
