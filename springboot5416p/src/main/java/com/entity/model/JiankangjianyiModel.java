package com.entity.model;

import com.entity.JiankangjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康建议
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-28 14:05:38
 */
public class JiankangjianyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 健康分析
	 */
	
	private String jiankangfenxi;
		
	/**
	 * 健康建议
	 */
	
	private String jiankangjianyi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：健康分析
	 */
	 
	public void setJiankangfenxi(String jiankangfenxi) {
		this.jiankangfenxi = jiankangfenxi;
	}
	
	/**
	 * 获取：健康分析
	 */
	public String getJiankangfenxi() {
		return jiankangfenxi;
	}
				
	
	/**
	 * 设置：健康建议
	 */
	 
	public void setJiankangjianyi(String jiankangjianyi) {
		this.jiankangjianyi = jiankangjianyi;
	}
	
	/**
	 * 获取：健康建议
	 */
	public String getJiankangjianyi() {
		return jiankangjianyi;
	}
			
}
