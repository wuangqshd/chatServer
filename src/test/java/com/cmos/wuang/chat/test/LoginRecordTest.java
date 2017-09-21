package com.cmos.wuang.chat.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cmos.wuang.chat.dao.model.LoginRecord;
import com.cmos.wuang.chat.service.manager.ILoginRecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class LoginRecordTest {
		@Autowired
		ILoginRecordService service;

		@Test
		public void testLoginRecord(){
			LoginRecord t = new LoginRecord();
			List<LoginRecord> list = service.findLoginRecord(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}