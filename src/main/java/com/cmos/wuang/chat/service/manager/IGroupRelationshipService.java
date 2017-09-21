package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.GroupRelationship;

public interface IGroupRelationshipService {

	public List<GroupRelationship> findGroupRelationship(GroupRelationship t , int currPage , int pageSize); 
	public boolean updateOne(GroupRelationship t);
	public boolean deleteOne(String id);
	public boolean insertOne(GroupRelationship t);

	public GroupRelationship findOne(String id);

}