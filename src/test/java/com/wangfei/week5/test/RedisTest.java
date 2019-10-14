package com.wangfei.week5.test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.wangfei.utils.StreamUtil;
import com.wangfei.utils.StringUtil;
import com.wangfei.week5.domain.Goods;

public class RedisTest extends JunitParent{
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void ioWeek5() {
		Goods goods = new Goods();
		File file = new File("src//test//resources//week5.txt");
	    String readTextFile = StreamUtil.readTextFile(file);
	    //1.判断实付是数字
	    int id = goods.getId();
	    boolean number = StringUtil.checkMobileNumber(readTextFile);
	    //2.商品名称要使用hasText()方法判断有没有值
	    String name = goods.getName();
	    boolean hasText = StringUtil.hasText(name);
	    //3.价格要使用hasText()方法判断有没有值
	    BigDecimal price = goods.getPrice();
	    
	}
	
	@Test
	public void RedisList() {
		Goods goods = new Goods();
		List<Goods> list = new ArrayList<Goods>();
		for (Goods goods2 : list) {
			//在Redis服务器定义一个key为goods_list，value为list类型
			redisTemplate.opsForList().leftPush("goods_list", list);
		}
	}
	
	@Test
	public void RedisZSet() {
		Goods goods = new Goods();
		List<Goods> zset= new ArrayList<Goods>();
		for (Goods goods2 : zset) {
			//在Redis服务器定义一个key为goods_zset，value为zset类型
			redisTemplate.opsForZSet().add("goods_zset", (Set) zset);
			
		}
		
	}
	

}
