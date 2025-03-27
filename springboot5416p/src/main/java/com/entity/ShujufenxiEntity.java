package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 数据分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-28 14:05:38
 */
@TableName("shujufenxi")
public class ShujufenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujufenxiEntity() {
		
	}
	
	public ShujufenxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 患病因素
	 */
					
	private String huanbingyinsu;
	
	/**
	 * 患病率
	 */
					
	private Float huanbinglv;
	
	/**
	 * 治疗率
	 */
					
	private Float zhiliaolv;
	
	/**
	 * 增长率
	 */
					
	private Float zengzhanglv;
	
	/**
	 * 死亡率
	 */
					
	private Float siwanglv;
	
	/**
	 * 统计年份
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjinianfen;
	
	/**
	 * 概括
	 */
					
	private String gaikuo;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：患病因素
	 */
	public void setHuanbingyinsu(String huanbingyinsu) {
		this.huanbingyinsu = huanbingyinsu;
	}
	/**
	 * 获取：患病因素
	 */
	public String getHuanbingyinsu() {
		return huanbingyinsu;
	}
	/**
	 * 设置：患病率
	 */
	public void setHuanbinglv(Float huanbinglv) {
		this.huanbinglv = huanbinglv;
	}
	/**
	 * 获取：患病率
	 */
	public Float getHuanbinglv() {
		return huanbinglv;
	}
	/**
	 * 设置：治疗率
	 */
	public void setZhiliaolv(Float zhiliaolv) {
		this.zhiliaolv = zhiliaolv;
	}
	/**
	 * 获取：治疗率
	 */
	public Float getZhiliaolv() {
		return zhiliaolv;
	}
	/**
	 * 设置：增长率
	 */
	public void setZengzhanglv(Float zengzhanglv) {
		this.zengzhanglv = zengzhanglv;
	}
	/**
	 * 获取：增长率
	 */
	public Float getZengzhanglv() {
		return zengzhanglv;
	}
	/**
	 * 设置：死亡率
	 */
	public void setSiwanglv(Float siwanglv) {
		this.siwanglv = siwanglv;
	}
	/**
	 * 获取：死亡率
	 */
	public Float getSiwanglv() {
		return siwanglv;
	}
	/**
	 * 设置：统计年份
	 */
	public void setTongjinianfen(Date tongjinianfen) {
		this.tongjinianfen = tongjinianfen;
	}
	/**
	 * 获取：统计年份
	 */
	public Date getTongjinianfen() {
		return tongjinianfen;
	}
	/**
	 * 设置：概括
	 */
	public void setGaikuo(String gaikuo) {
		this.gaikuo = gaikuo;
	}
	/**
	 * 获取：概括
	 */
	public String getGaikuo() {
		return gaikuo;
	}

}
