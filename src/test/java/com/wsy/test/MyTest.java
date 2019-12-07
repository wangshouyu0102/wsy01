package com.wsy.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsy.mapper.GoodsMapper;
import com.wsy.pojo.Goods;

import utils.IOUtils;
import utils.StringUtil;

public class MyTest {
	
	public static void main(String[] args) {
		List<Object[]> list = IOUtils.readFile("src/main/resources/file.txt", "\\==");
		for (Object[] objects : list) {
		/*	System.out.println(objects[0]+""+objects[1]+""+objects[2]+""+objects[3]+"");*/
//			System.out.println(Arrays.toString(objects));
//			System.out.println(Integer.parseInt(objects[0]+"")+" "+objects[1]+""+" "+(objects[2]+"").replace("¥", "")+" "+(objects[3]+"").replace("%", ""));
//			System.out.println(objects[0]+"");
//			System.out.println(StringUtil.isNumber(objects[0]+""));
			
//			System.out.println(objects[1]+"");
//			System.out.println(StringUtil.isEmpty(objects[1]+""));
			
			System.out.println(objects[2]+"");
			StringUtil.isEmpty(objects[1]+"");
			
			/*Goods goods = new Goods(Integer.parseInt(objects[0]+""), objects[1]+"", new BigDecimal((objects[2]+"").replace("¥", "")),  Integer.parseInt((objects[3]+"").replace("%", "")));
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			GoodsMapper mapper = ac.getBean(GoodsMapper.class);
			mapper.saveGoods(goods);*/
			
		}
	}
}
