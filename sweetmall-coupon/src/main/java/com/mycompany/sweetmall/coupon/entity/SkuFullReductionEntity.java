package com.mycompany.sweetmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author hello633
 * @email hello633@gmail.com
 * @date 2021-11-11 16:25:48
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 
	 */
	private BigDecimal fullPrice;
	/**
	 * 
	 */
	private BigDecimal reducePrice;
	/**
	 * 
	 */
	private Integer addOther;

}
