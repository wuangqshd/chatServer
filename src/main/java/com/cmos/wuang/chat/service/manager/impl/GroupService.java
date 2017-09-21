package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.Group;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.IGroupService;

@Service
public class GroupService extends BaseService<Group> implements IGroupService {

	public List<Group> findGroup(Group t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Group t) {
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
	public boolean insertOne(Group t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Group findOne(String id) {

		try {
			Group t = new Group();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}