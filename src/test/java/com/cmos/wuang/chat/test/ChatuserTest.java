package com.cmos.wuang.chat.test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cmos.wuang.chat.dao.model.Chatuser;
import com.cmos.wuang.chat.service.manager.IChatuserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ChatuserTest {
		@Autowired
		IChatuserService service;

		@Test
		public void testChatuser(){
			Chatuser t = new Chatuser();
//			List<Chatuser> list = service.findChatuser(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
			t.setId(UUID.randomUUID().toString());
			t.setUsername("ÀîËÄ");
			t.setChatnum("000002");
			System.out.println(service.insertOne(t));
		}
}