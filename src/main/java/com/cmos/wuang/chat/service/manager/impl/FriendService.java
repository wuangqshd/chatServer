package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.Friend;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.IFriendService;

@Service
public class FriendService extends BaseService<Friend> implements IFriendService {

	public List<Friend> findFriend(Friend t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Friend t) {
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
	public boolean insertOne(Friend t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Friend findOne(String id) {

		try {
			Friend t = new Friend();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}