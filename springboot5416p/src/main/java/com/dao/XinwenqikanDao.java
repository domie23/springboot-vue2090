package com.dao;

import com.entity.XinwenqikanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenqikanVO;
import com.entity.view.XinwenqikanView;


/**
 * 新闻期刊
 * 
 * @author 
 * @email 
 * @date 2023-03-28 14:05:38
 */
public interface XinwenqikanDao extends BaseMapper<XinwenqikanEntity> {
	
	List<XinwenqikanVO> selectListVO(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
	
	XinwenqikanVO selectVO(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
	
	List<XinwenqikanView> selectListView(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);

	List<XinwenqikanView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
	
	XinwenqikanView selectView(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
	

}
