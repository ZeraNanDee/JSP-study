package com.ZeraNanDee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {//用于服务器端对客户端浏览器做出一些响应，这也是servlet存在的原因
//servlet 作为一个中间块运行于tomcat服务器内
	private static final long serialVersionUID = -3602345692759060442L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//	{
//		String username=req.getParameter("uname");
//		String password=req.getParameter("upwd");
//		System.out.println("用户名："+username);
//		System.out.println("密码："+password);
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=========进入doGet方法==========");
		String username=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名："+username);
		System.out.println("密码："+password);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=========进入doPost方法==========");
		String username=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名："+username);
		System.out.println("密码："+password);
		
		String forward=null;
		
		if (username.equals("Zera")&&password.equals("huang110")) {
		
			forward="/Test14/success.jsp";//请求转发
			RequestDispatcher  rd=req.getRequestDispatcher(forward);//此方法是请求服务器转发，参数表示要转发的地址
			rd.forward(req, resp);//完成转发的操作,这个这个转发方法POST的提交信息可以被显示
			
			//RequestDispatcher和resp.sendRedirect的区别：前者用于转发当前数据，只能从服务器当前已有的内容转发,
			//而后者相当于URL是调度服务器产生一个链接,不返回POST的数据，可以是外连接（例如www.baidu.com）
			
			//请求重定向
			//resp.sendRedirect(req.getContextPath()+"/Test14/success.jsp");//response对象的sendRedirect用于服务器向客户端浏览器返回一个页面
		}else {//内容为返回一个客户端向服务器的请求路径和接受页面
			
			forward="/Test14/error.jsp";//请求转发
			RequestDispatcher  rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			
			//请求重定向
			//resp.sendRedirect(req.getContextPath()+"/Test14/error.jsp");
		}
	}

}
