package cn.com.mymis.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.mymis.domain.User;
import cn.com.mymis.service.UserService;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("loginIn")
	public String LoginIn(HttpServletRequest request, HttpServletResponse response, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		System.out.println(id+" "+password);
		
		User user = userService.selectUserById(id);
		
		if(user.getPassword().equals(password)) {
			model.addAttribute("user", user);
			System.out.println("-------"+user.getName());

			return "show";
		}else {
			return "login";
		}
		
	}
	@RequestMapping("login")
	public String Login(HttpServletRequest request, HttpServletResponse response, Model model) {
	
			return "login";		
	}
}
