package com.hbue.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		//获取指定的name的初始化参数
		String str = config.getInitParameter("username");
		System.out.println(str);
		//获取所有的初始化参数
		Enumeration<String> enumeration = config.getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name +" "+ value);
		}
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destory");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		ADao dao = new ADao();
//		//从数据库中拿出所需要的数据
//		List<A> a = dao.getAll();
//		//将数据库中的数据放入request中
//		request.setAttribute("a", a);
//		//跳转页面
//		request.getRequestDispatcher("/B.jsp").forward(request,response);
//		//请求的重定向 得到当前路径+XXX
//		response.sendRedirect(request.getContextPath()+"/XXX");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
