package com.cmos.wuang.chat.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cmos.wuang.chat.dao.model.Grouping;
import com.cmos.wuang.chat.service.manager.IGroupingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class GroupingTest {
		@Autowired
		IGroupingService service;

		@Test
		public void testGrouping(){
			Grouping t = new Grouping();
			List<Grouping> list = service.findGrouping(t,1,10);
			System.out.println(list.size());
		}
}