package com.cmos.wuang.chat.service.manager;

import java.util.List;
import com.cmos.wuang.chat.dao.model.LoginRecord;

public interface ILoginRecordService {

	public List<LoginRecord> findLoginRecord(LoginRecord t , int currPage , int pageSize); 
	public boolean updateOne(LoginRecord t);
	public boolean deleteOne(String id);
	public boolean insertOne(LoginRecord t);

	public LoginRecord findOne(String id);

}