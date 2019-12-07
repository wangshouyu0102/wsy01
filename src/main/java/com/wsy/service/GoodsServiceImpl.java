package com.wsy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsy.mapper.GoodsMapper;
import com.wsy.pojo.Goods;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	
	public List<Goods> queryGoods(Map<String, Object> map) {
		return goodsMapper.queryGoods(map);
	}

}
