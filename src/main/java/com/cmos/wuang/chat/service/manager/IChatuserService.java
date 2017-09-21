package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.Chatuser;

public interface IChatuserService {

	public List<Chatuser> findChatuser(Chatuser t , int currPage , int pageSize); 
	public boolean updateOne(Chatuser t);
	public boolean deleteOne(String id);
	public boolean insertOne(Chatuser t);

	public Chatuser findOne(String id);

}