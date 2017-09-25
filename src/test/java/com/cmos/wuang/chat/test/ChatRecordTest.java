package com.cmos.wuang.chat.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cmos.wuang.chat.dao.model.ChatRecord;
import com.cmos.wuang.chat.service.manager.IChatRecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ChatRecordTest {
		@Autowired
		IChatRecordService service;

		@Test
		public void testChatRecord(){
			ChatRecord t = new ChatRecord();
			List<ChatRecord> list = service.findChatRecord(t,1,10);
			System.out.println(list.size());
		}
}