package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MyUserDAO;

@Controller
public class MyController {
	
	@Autowired
	private MyUserDAO userDao;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JdbcTemplate 사용하기";
	}
	
	@GetMapping("/users")
	public String userlistPage(Model model) {
		model.addAttribute("users", userDao.list());
		return "userlist";
	}
}
