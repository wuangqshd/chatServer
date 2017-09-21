package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.GroupRelationship;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.IGroupRelationshipService;

@Service
public class GroupRelationshipService extends BaseService<GroupRelationship> implements IGroupRelationshipService {

	public List<GroupRelationship> findGroupRelationship(GroupRelationship t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(GroupRelationship t) {
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
	public boolean insertOne(GroupRelationship t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public GroupRelationship findOne(String id) {

		try {
			GroupRelationship t = new GroupRelationship();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}