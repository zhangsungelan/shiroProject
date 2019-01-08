package com.zhangsun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShiroController {
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req, Model model) {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username+":"+password);
		boolean flag=false;
		if(username.equals("zhangsun") & password.equals("123456")) {
			flag=true;
		}
		//dfsdfsdfsd
		System.out.println(flag);
		model.addAttribute("username", "hello :" + username);
		return "success";
	}
}
