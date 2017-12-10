package com.ZeraNanDee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet18 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet18() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();// 退出后刷新session记录
		response.sendRedirect(request.getContextPath() + "/Test18/index.jsp");// 服务器向浏览器返回首页
	}

}
