package cn.uc.yqb.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.uc.yqb.dao.NewsDao;
import cn.uc.yqb.pojo.TNews;
import cn.uc.yqb.service.NewsService;
import cn.uc.yqb.utils.Result;

@Service("newsService")
public class NewsServiceImpl implements NewsService{

	@Resource
	NewsDao newsDao;


	@Override
	 public List<TNews> list(){
		 String hql="from TNews";
		 return newsDao.getListByCondition(hql, null);
	 }

	@Override
	@Transactional
	public int add(TNews t) {
		newsDao.addEntity(t);
		return 1;
	}

	@Override
	@Transactional
	public int delete(Serializable id) {
		TNews news = newsDao.getEntity(TNews.class, id);
		if(news!=null){
			newsDao.deleteEntity(news);
			return 1;
		}
		return 0;
	}

	@Override
	@Transactional
	public int update(TNews t) {
		newsDao.saveOrUpdateEntity(t);
		return 1;
	}

	@Override
	public Result getNews(Serializable id) {
		Result result=new Result();
		result.setRetCode(1001);
		result.setRetMsg("获取失败");
		TNews news = newsDao.getEntity(TNews.class, id);
		if(news!=null){
			result.setRetData(news);
			result.setRetCode(1000);
			result.setRetMsg("获取成功");
		}
		return result;
	}
}
