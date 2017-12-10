package com.ZeraNanDee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginServlet18() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("uname");
	String upwd=request.getParameter("upwd");
	String returnURI=request.getParameter("return_uri");//通过这个值登录成功后，可以跳转回登录前的页面
	RequestDispatcher requestDispatcher=null;
		if (uname==null||upwd==null) {
			request.setAttribute("msg", "用户名或者密码为空");//返回错误提示信息
			requestDispatcher=request.getRequestDispatcher("/Test18/login.jsp");//请求转发
			requestDispatcher.forward(request, response);
		}else {
			if (uname.equals("ZeraNanDee")&&upwd.equals("huang110")) {
				request.getSession().setAttribute("flag", "Login_success");//在当前session对象保存一个key：flag，名为login_success

				if (returnURI!=null) {//URL是URI的子集，URI是统一资源标识符（名称和路径），URL是统一资源定位符（路径）
					requestDispatcher=request.getRequestDispatcher(returnURI);//请求转发URI，登录成功，可以显示
					requestDispatcher.forward(request, response);
				}
				else {
					requestDispatcher=request.getRequestDispatcher("/Test18/index.jsp");//等于空的话表示在首页不显示
					requestDispatcher.forward(request, response);
				}
			}else {
				request.getSession().setAttribute("flag", "Login_error");//如果登录错误保存一下错误的session对象
				request.setAttribute("msg", "用户名或者密码错误");
				requestDispatcher=request.getRequestDispatcher("/Test18/login.jsp");//登录失败就跳转回登录页面
				requestDispatcher.forward(request, response);
			}
		}
	}

}
