package com.wangfei.week5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedisController {
	
	/**
	 * 
	 * @Title: redisList 
	 * @Description: redisList 的Controller
	 * @param model
	 * @param pageSize
	 * @param pageNum
	 * @return
	 * @return: String
	 */
	@RequestMapping("redisList")
	public String redisList(Model model,Integer pageSize,Integer pageNum) {
	
		
		return null;
	}
	
	/**
	 * 
	 * @Title: redisZSet 
	 * @Description: redisZSet 的Controller
	 * @param model
	 * @param pageSize
	 * @param pageNum
	 * @return
	 * @return: String
	 */
	
	@RequestMapping("redisList")
	public String redisZSet(Model model,Integer pageSize,Integer pageNum) {
		
		
		return null;
	}

}
