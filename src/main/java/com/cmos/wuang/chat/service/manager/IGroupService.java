package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.Group;

public interface IGroupService {

	public List<Group> findGroup(Group t , int currPage , int pageSize); 
	public boolean updateOne(Group t);
	public boolean deleteOne(String id);
	public boolean insertOne(Group t);

	public Group findOne(String id);

}