package cn.uc.yqb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.uc.yqb.service.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	@Resource
	WeatherService weatherService;
	
	@RequestMapping("/weather")
	public ModelAndView weather(){
		return new ModelAndView("weather");
	}

	@RequestMapping("/getProvinces")
	@ResponseBody
	public List<String> getProvinces(){
		return weatherService.getProvinces();
	}
	
	
	@RequestMapping("/getCities")
	@ResponseBody
	public List<String> getCities(String province){
		return weatherService.getCities(province);
	}
	
	@RequestMapping("/getWeather")
	@ResponseBody
	public List<String> getWeather(String code){
		return weatherService.getWeather(code);
	}
}
