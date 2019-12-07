package com.wsy.mapper;

import java.util.List;
import java.util.Map;

import com.wsy.pojo.Goods;

public interface GoodsMapper {
	
	public Integer saveGoods(Goods goods);
	
	public List<Goods> queryGoods(Map<String, Object> map);
	
}
