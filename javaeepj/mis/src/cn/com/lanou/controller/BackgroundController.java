package cn.com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.lanou.domain.Resources;
import cn.com.lanou.domain.Userloginlist;
import cn.com.lanou.service.ResourcesService;
import cn.com.lanou.service.UserService;
import cn.com.lanou.service.UserloginlistService;
import cn.com.lanou.util.Common;

@Controller
@RequestMapping ("/background/")
public class BackgroundController {

	@Resource
	private UserService userService;
	
	@Resource
	private UserloginlistService userloginlistService;
	
	@Resource
	private ResourcesService resourcesService;
	
	
	/**
	 * 跳转登录页
	 */
	@RequestMapping("login")
	public String login(Model model){
		return "/background/framework/login";
	}
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping ("loginCheck")
	public String loginCheck(String username,String password,
			HttpServletRequest request){
		//后台校验用户名和密码是否为空,如果为空返回登录页
		if(Common.isEmpty(username) || Common.isEmpty(password)){
			request.setAttribute("error","用户名或密码不能为空！");
			return "/background/framework/login";
		}
		
		Map user = userService.getUserByUserName(username);
		if(user == null || !user.get("userPassword").toString().equals(password)){
			request.setAttribute("error", "用户名或密码不正确！");
		    return "/background/framework/login";
		}
		//当验证都通过后，把用户信息放在session里
		request.getSession().setAttribute("userSession", user);
		
		//更新当前用户登录时间
		userService.updateLastLogintime(username);
		
		Userloginlist userloginlist = new Userloginlist();
		userloginlist.setUserid((Integer)user.get("userId"));
		userloginlist.setLoginip(Common.toIpAddr(request));
		//存储用户的登录id和ip
		userloginlistService.insertUserloginlist(userloginlist);
		
		return "redirect:index.do";
	}
	
	
	/**
	 * 跳转首页
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(Model model){
		return "/background/framework/main";
	}
	
	/**
	 * 首页的顶部区域
	 * @param model
	 * @return
	 */
	@RequestMapping ("top")
	public String top(Model model){
		return "/background/framework/top";
	}
	
	/**
	 * 首页的下半部分主体区域
	 * @param model
	 * @return
	 */
	@RequestMapping ("center")
	public String center(Model model){
		return "/background/framework/center";
	}
	
	/**
	 * 首页的顶部区域的左侧菜单部分
	 * @param model
	 * @return
	 */
	@RequestMapping ("left")
	public String left(HttpServletRequest req,Model model){
		Map user = (Map)req.getSession().getAttribute("userSession");
		String username = user.get("userName").toString();
		
		List<Resources> resources = resourcesService.getResourcesByUserName(username);
		model.addAttribute("resources", resources);
		
		Map<String,Resources> resMap = new HashMap<String,Resources>();
		for(Resources res : resources){
			resMap.put(res.getReskey(), res);
		}
		req.getSession().setAttribute("resMap", resMap);
		return "/background/framework/left";
	}
	
	/**
	 * 首页的顶部区域的右侧正文部分
	 * @param model
	 * @return
	 */
	@RequestMapping ("tab")
	public String tab(Model model){
		return "/background/framework/tab/tab";
	}
}
