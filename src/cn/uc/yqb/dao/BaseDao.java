package cn.uc.yqb.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	void addEntity(T t);

	void deleteEntity(T t);

	void saveOrUpdateEntity(T t);

	T getEntity(Class cls,Serializable id);

	List<T> getListByCondition(String hql, Object... params);

	List<T> getPageListByCondition(String hql, int pageNo, int pageSize, Object... params);

}
