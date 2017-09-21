package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.ChatRecord;

public interface IChatRecordService {

	public List<ChatRecord> findChatRecord(ChatRecord t , int currPage , int pageSize); 
	public boolean updateOne(ChatRecord t);
	public boolean deleteOne(String id);
	public boolean insertOne(ChatRecord t);

	public ChatRecord findOne(String id);

}