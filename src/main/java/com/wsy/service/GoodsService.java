package com.wsy.service;

import java.util.List;
import java.util.Map;

import com.wsy.pojo.Goods;

public interface GoodsService {
	
	public List<Goods> queryGoods(Map<String, Object> map);
	
}
