package com.entity.model;

import com.entity.ShujufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数据分析
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-28 14:05:38
 */
public class ShujufenxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjinianfen;
		
	/**
	 * 概括
	 */
	
	private String gaikuo;
				
	
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
