package com.entity.view;

import com.entity.XinwenqikanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻期刊
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 14:05:38
 */
@TableName("xinwenqikan")
public class XinwenqikanView  extends XinwenqikanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenqikanView(){
	}
 
 	public XinwenqikanView(XinwenqikanEntity xinwenqikanEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenqikanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
