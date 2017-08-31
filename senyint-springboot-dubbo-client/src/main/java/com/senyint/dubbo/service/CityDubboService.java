package com.senyint.dubbo.service;

import com.senyint.dubbo.entity.City;


/**
* @ClassName: CityDubboService
* @Description: 接口类 和 生产者一直 正常用法应单独放到实体类接口工程中
* @author zhangyu
* @date 2017年8月30日上午10:26:14
*
*/
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
