package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.Grouping;

public interface IGroupingService {

	public List<Grouping> findGrouping(Grouping t , int currPage , int pageSize); 
	public boolean updateOne(Grouping t);
	public boolean deleteOne(String id);
	public boolean insertOne(Grouping t);

	public Grouping findOne(String id);

}