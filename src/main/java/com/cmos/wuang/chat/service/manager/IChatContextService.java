package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.ChatContext;

public interface IChatContextService {

	public List<ChatContext> findChatContext(ChatContext t , int currPage , int pageSize); 
	public boolean updateOne(ChatContext t);
	public boolean deleteOne(String id);
	public boolean insertOne(ChatContext t);

	public ChatContext findOne(String id);

}