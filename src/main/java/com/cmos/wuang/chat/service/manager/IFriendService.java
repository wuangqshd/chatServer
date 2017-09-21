package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.Friend;

public interface IFriendService {

	public List<Friend> findFriend(Friend t , int currPage , int pageSize); 
	public boolean updateOne(Friend t);
	public boolean deleteOne(String id);
	public boolean insertOne(Friend t);

	public Friend findOne(String id);

}