package cn.uc.yqb.service;

import java.util.List;

public interface WeatherService {

	//
	List<String> getProvinces();
	
	//
	List<String> getCities(String province);
	
	//
	List<String> getWeather(String code);
}
