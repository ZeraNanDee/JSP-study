package com.ZeraNanDee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet17 extends HttpServlet {//过滤器解决中文乱码问题

	private static final long serialVersionUID = 1L;

	public LoginServlet17() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("=========进入doPost方法==========");
		String username=request.getParameter("uname");
		String password=request.getParameter("upwd");
		System.out.println("用户名："+username);
		System.out.println("密码："+password);
		
		String forward=null;
		
		if (username.equals("黄伟鑫")&&password.equals("huang110")) {
		
			forward="/Test17/success.jsp";//请求转发
			RequestDispatcher  rd=request.getRequestDispatcher(forward);//此方法是请求服务器转发，参数表示要转发的地址
			rd.forward(request, response);//完成转发的操作,这个这个转发方法POST的提交信息可以被显示	
		}else {
			forward="/Test17/error.jsp";//请求转发
			RequestDispatcher  rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);

		}
		
	}

}
