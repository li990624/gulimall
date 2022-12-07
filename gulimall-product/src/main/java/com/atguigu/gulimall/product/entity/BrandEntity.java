package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;


/**
 * 品牌
 * 
 * @author xiansen
 * @email xiansen@gmail.com
 * @date 2022-08-18 15:02:40
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名必须提交")//这个字段不能为空并且至少有一个非空的字符
	private String name;
	/**
	 * 品牌logo地址
	 * @NotEmpty//不能为空
	 */
	@NotEmpty
	@URL(message = "logo必须是一个合法的url地址")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 * @NotEmpty不能为空
	 * @Pattern(regexp = "^[a-zA-z]$")//自定义校验规则注解
	 */
	@NotEmpty
	@Pattern(regexp = "^[a-zA-z]$")
	private String firstLetter;
	/**
	 * 排序
	 * @NotNull不能为空
	 */
	@NotNull
	@Min(value = 0,message = "排序必须大于等于0")
	private Integer sort;

}
