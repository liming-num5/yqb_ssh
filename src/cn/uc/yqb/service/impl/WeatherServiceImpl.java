package cn.uc.yqb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;
import cn.uc.yqb.service.WeatherService;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

	WeatherWS weatherWs=new WeatherWS();//创建服务类对象
	
	WeatherWSSoap soap = weatherWs.getWeatherWSSoap();
	
	
	
	
	@Override
	public List<String> getProvinces() {
		ArrayOfString pros = soap.getRegionProvince();//获取省份
		
		return pros.getString();
	}

	@Override
	public List<String> getCities(String province) {
		ArrayOfString citys = soap.getSupportCityString(province);//获取某个省份的市
		
		return citys.getString();
	}

	@Override
	public List<String> getWeather(String code) {
		ArrayOfString weathers = soap.getWeather(code, "");
		return weathers.getString();
	}

}
