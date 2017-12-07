package cn.uc.yqb.dao.impl;

import org.springframework.stereotype.Repository;

import cn.uc.yqb.dao.NewsDao;
import cn.uc.yqb.pojo.TNews;

@Repository("newsDao")
public class NewsDaoImpl extends BaseDaoImpl<TNews> implements NewsDao {

}
