package com.cmos.wuang.chat.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cmos.wuang.chat.dao.model.GroupRelationship;
import com.cmos.wuang.chat.service.manager.IGroupRelationshipService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class GroupRelationshipTest {
		@Autowired
		IGroupRelationshipService service;

		@Test
		public void testGroupRelationship(){
			GroupRelationship t = new GroupRelationship();
			List<GroupRelationship> list = service.findGroupRelationship(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}