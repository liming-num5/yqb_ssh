package cn.uc.yqb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uc.yqb.pojo.TNews;
import cn.uc.yqb.service.NewsService;
import cn.uc.yqb.utils.Result;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@Resource
	NewsService newsService;

	@RequestMapping("/addNews")
	public String addNews(Model model,TNews news){
		newsService.add(news);
		model.addAttribute("newsTitle","马蓉首现身");
		return "news_list";
	}
	
	
	@RequestMapping("/deleteNews")
	public String deleteNews(Model model,int id){
			newsService.delete(id);
		model.addAttribute("newsTitle","宋喆入狱");
		return "news_list";
	}
	
	
	@RequestMapping("/newsList")
	@ResponseBody
	public List<TNews> getNewsList(){
		List<TNews> newsList = newsService.list();
		return newsList;
	}
	
	@RequestMapping("/getNews")
	@ResponseBody
	public Result getNews(){
		Result result = newsService.getNews(63);
		return result;
	}
}
