package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.Grouping;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.IGroupingService;

@Service
public class GroupingService extends BaseService<Grouping> implements IGroupingService {

	public List<Grouping> findGrouping(Grouping t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Grouping t) {
		try {
			updateByPrimaryKey(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteOne(String id) {
		try {
			deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean insertOne(Grouping t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Grouping findOne(String id) {

		try {
			Grouping t = new Grouping();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}