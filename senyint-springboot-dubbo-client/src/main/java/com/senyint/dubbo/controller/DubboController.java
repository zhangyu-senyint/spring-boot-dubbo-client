package com.senyint.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.senyint.dubbo.entity.Account;
import com.senyint.dubbo.entity.City;
import com.senyint.dubbo.service.AccountService;
import com.senyint.dubbo.service.CityDubboService;

/**
* @ClassName: DubboController
* @Description: dubbo测试类
* @author zhangyu
* @date 2017年8月30日上午10:24:51
*
*/
@RestController
@RequestMapping(value="/dubbo")
public class DubboController {
	
	@Reference(version = "1.0.0")
	private CityDubboService cityDubboService;
	
	@Reference(version = "1.0.0")
	private AccountService accountService;
	
	@RequestMapping(value="/index")
	public City Index() {
		String cityName="辽阳";
		return cityDubboService.findCityByName(cityName);
		 
	}
	
	@RequestMapping(value="/account")
	public Account account() {
		return accountService.getAccount();
		 
	}



}
