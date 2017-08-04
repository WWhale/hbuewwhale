package cn.com.lanou.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.com.lanou.domain.User;
import cn.com.lanou.service.UserService;
import cn.com.lanou.util.Common;
import cn.com.lanou.util.PageView;

@Controller
@RequestMapping("/background/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * @param model
	 * 存放返回界面的model
	 * @return
	 */
	@RequestMapping("query")
	public String query(Model model, User user, String pageNow) {
		PageView pageView = new PageView();
		pageView = userService.query(pageView, user);
		model.addAttribute("pageView", pageView);
		return "/background/user/list";
	}
}
