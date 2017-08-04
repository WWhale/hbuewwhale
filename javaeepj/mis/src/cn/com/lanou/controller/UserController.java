package cn.com.lanou.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.lanou.domain.PageView;
import cn.com.lanou.domain.Role;
import cn.com.lanou.domain.User;
import cn.com.lanou.domain.UserRoleKey;
import cn.com.lanou.service.RoleService;
import cn.com.lanou.service.UserRoleKeyService;
import cn.com.lanou.service.UserService;

@Controller
@RequestMapping("/background/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@Resource
	private RoleService roleService;
	
	@Resource
	private UserRoleKeyService userRoleKeyService;
	
	/**
	 * 分页查询用户信息
	 * @param model
	 * @param pageNow 当前页数
	 * @return
	 */
	@RequestMapping("query")
	public String query(Model model,String pageNow,User user){
		
		PageView pageView = new PageView();
		
		if(pageNow != null && !"".equals(pageNow)){
			pageView.setPageNow(Long.parseLong(pageNow));
		}
		
		pageView = userService.getUsersByPageNow(pageView,user);
		
		model.addAttribute("pageView", pageView);
		return "/background/user/list";
	}
	
	/**
	 * 分配角色页
	 * @param request
	 * @return
	 */
	@RequestMapping("userRole")
	public String userRole(HttpServletRequest request){
		String userName = request.getParameter("userName");
		Map user = userService.getUserByUserName(userName);
		request.setAttribute("user", user);
		getRoles(request);
		return "/background/user/userRole";
	}
	
	/**
	 * 保存用户与角色关联
	 * @param model
	 * @param userRoleKey
	 * @return
	 */
	@ResponseBody
	@RequestMapping("allocation")
	public String allocation(Model model,UserRoleKey userRoleKey){
		String errorCode = "1000";
		try {
			userRoleKeyService.addUserRoleKey(userRoleKey);
		} catch (Exception e) {
			e.printStackTrace();
			errorCode = "1001";
		}
		return errorCode;
	}
	
	/**
	 * 删除用户和用户角色关联表信息
	 * 
	 * @param model
	 * @param videoTypeId
	 * @return
	 */
	@RequestMapping("deleteByUserId")
	public String deleteByUserId(Model model, String userId) {
		userService.deleteUser(userId);
		return "redirect:query.do";
	}
	
	/**
	 * 根据type进入查看或修改用户信息页
	 * @param model
	 * @param userId
	 * @param type 0查看1修改
	 * @return
	 */
	@RequestMapping("getById")
	public String getById(HttpServletRequest request,Model model, String userName, int type){
		Map user = userService.getUserByUserName(userName);
		model.addAttribute("user", user);
		getRoles(request);
		if (type == 1) {
			return "/background/user/edit";
		} else {
			return "/background/user/show";
		}
	}
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping("update")
	public String update(User user){
		userService.updateUser(user);
		return "redirect:query.do";
	}
	
	/**
	 * 跳转新增用户界面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("addUI")
	public String addUI() {
		return "/background/user/add";
	}
	
	/**
	 * 保存新增的用户
	 * @param user
	 * @return
	 */
	@RequestMapping("add")
	public String add(User user){
		userService.addUser(user);
		return "redirect:query.do";
	}
	
	/**
	 * 删除所选的用户
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("deleteAll")
	public String deleteAll(Model model, String[] check) {
		int[] userids = new int[check.length];
		for(int i = 0; i < check.length; i++){
			userids[i] = Integer.parseInt(check[i]);
		}
		userService.deleteAll(userids);
		return "redirect:query.do";
	}
	
	/**
	 * 在查询所有角色之前，先看session中有没有roles，如果有直接从session中获取
	 * 注意，在角色表执行过“增删改”的操作之后，要清除session中的roles。
	 * @param request
	 */
	public void getRoles(HttpServletRequest request){
		//在查询所有角色之前，先看session中有没有roles，如果有直接从session中获取
		//注意，在角色表执行过“增删改”的操作之后，要清除session中的roles。
		List<Role> roles = (List<Role>) request.getSession().getAttribute("roles");
		if(roles == null){
			roles = roleService.getAll();
			request.getSession().setAttribute("roles", roles);
		}
	}
	
	
}
