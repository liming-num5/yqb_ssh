package cn.uc.yqb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;
import cn.uc.yqb.service.WeatherService;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

	WeatherWS weatherWs=new WeatherWS();//�������������
	
	WeatherWSSoap soap = weatherWs.getWeatherWSSoap();
	
	
	
	
	@Override
	public List<String> getProvinces() {
		ArrayOfString pros = soap.getRegionProvince();//��ȡʡ��
		
		return pros.getString();
	}

	@Override
	public List<String> getCities(String province) {
		ArrayOfString citys = soap.getSupportCityString(province);//��ȡĳ��ʡ�ݵ���
		
		return citys.getString();
	}

	@Override
	public List<String> getWeather(String code) {
		ArrayOfString weathers = soap.getWeather(code, "");
		return weathers.getString();
	}

}
