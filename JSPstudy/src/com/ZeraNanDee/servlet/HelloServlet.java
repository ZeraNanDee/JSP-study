package com.ZeraNanDee.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {//用于服务器端的JAVA的特定类，tomcat就是servlet容器,可在WEB-INF的web.xml内配置

	public void init() throws ServletException {
		System.out.println("======init without parameters=====");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {//有参的init方法会先被执行,有参的方法内含有无参
		System.out.println("======init with parameters=====");
		super.init(config);//此方法接收请求，只会被调用一次，相当于入口
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======service=====");//此方法用于处理客户端请求,会被调用多次，跟请求次数有关
	PrintWriter pw=response.getWriter();//用于服务器向客户端浏览器输出helloworld
	pw.println("hello world");
	pw.close();
	}

	@Override
	public void destroy() {//当servlet不用时，会有destroy销毁方法，也只会调用一次
		System.out.println("======destroy=====");
		super.destroy();
	}


}
