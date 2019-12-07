package com.wsy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wsy.pojo.Goods;
import com.wsy.service.GoodsService;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("query")
	public String queryGoods(Integer minPrice, Integer maxPrice, Integer minSales, Integer maxSales, @RequestParam(defaultValue="1")Integer pageNum,Model m){
		Map<String, Object> map = new HashMap<String, Object>();
		
		PageHelper.startPage(pageNum, 5);
		
		map.put("minPrice", minPrice);
		map.put("maxPrice", maxPrice);
		map.put("minSales", minSales);
		map.put("maxSales", maxSales);
		
		List<Goods> list = goodsService.queryGoods(map);
		
		PageInfo<Goods> page = new  PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("map", map);
		return "list";
		
	}
}
