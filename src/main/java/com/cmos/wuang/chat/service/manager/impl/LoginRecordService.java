package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.LoginRecord;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.ILoginRecordService;

@Service
public class LoginRecordService extends BaseService<LoginRecord> implements ILoginRecordService {

	public List<LoginRecord> findLoginRecord(LoginRecord t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(LoginRecord t) {
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
	public boolean insertOne(LoginRecord t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public LoginRecord findOne(String id) {

		try {
			LoginRecord t = new LoginRecord();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}