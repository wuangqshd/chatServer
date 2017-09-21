package com.cmos.wuang.chat.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmos.wuang.chat.dao.model.Chatuser;
import com.cmos.wuang.chat.service.manager.impl.ChatContextService;
import com.cmos.wuang.chat.service.manager.impl.ChatuserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class LoginController {
	
	@Autowired 
	ChatuserService chatuserService;
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) throws Exception {
		Chatuser user = new Chatuser();
		user = chatuserService.findOne("fdasdasdffasdf");
		ObjectMapper mapper = new ObjectMapper();
		String string = mapper.writeValueAsString(user);
		model.addAttribute("user", string);
		return "index";
	}
	@RequestMapping("/index")
	@ResponseBody
	public String index(HttpServletRequest request,HttpServletResponse response) {
		return "Hello World!";
	}
}
