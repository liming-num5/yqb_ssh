package cn.uc.yqb.service;

import java.io.Serializable;
import java.util.List;

import cn.uc.yqb.pojo.TNews;
import cn.uc.yqb.utils.Result;

public interface NewsService{
	
	List<TNews> list();	
	
	public int add(TNews t);

	public int delete(Serializable id);

	public int update(TNews t);
	
	public Result getNews(Serializable id);
}
