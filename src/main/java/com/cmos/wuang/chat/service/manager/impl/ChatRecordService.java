package com.cmos.wuang.chat.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.cmos.wuang.chat.service.BaseService;
import com.cmos.wuang.chat.dao.model.ChatRecord;
import com.github.pagehelper.PageHelper;
import com.cmos.wuang.chat.service.manager.IChatRecordService;

@Service
public class ChatRecordService extends BaseService<ChatRecord> implements IChatRecordService {

	public List<ChatRecord> findChatRecord(ChatRecord t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(ChatRecord t) {
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
	public boolean insertOne(ChatRecord t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public ChatRecord findOne(String id) {

		try {
			ChatRecord t = new ChatRecord();
			t.setId(id);
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}