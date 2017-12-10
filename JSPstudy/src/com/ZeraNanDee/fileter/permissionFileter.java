package com.ZeraNanDee.fileter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class permissionFileter implements Filter {

	public permissionFileter() {

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request2 = (HttpServletRequest) request;//这个类是上面ServletRequest的子类，多了几个方法
		HttpServletResponse response2 = (HttpServletResponse) response;
		String servletPath = request2.getServletPath();//获取servlet当前路径
		HttpSession session = request2.getSession();//获取当前session对象
		String flag = (String) session.getAttribute("flag");//将flag的值设置成“flag”和Loginservlet18一致

		if (servletPath != null && (servletPath.equals("/Test18/login.jsp"))
				|| (servletPath.equals("/Test18/index.jsp"))||(servletPath.equals("/LoginServlet18"))) {
			chain.doFilter(request, response);//等于这三个情况都不做任何操作，除了点击hello.jsp会跳转进login.jsp
		}else {
			if (flag!=null&&flag.equals("Login_success")) {//如果用户是登录状态可以直接进行访问
				chain.doFilter(request, response);
			}else if (flag!=null&&flag.equals("Login_error")) {
				request2.setAttribute("msg", "登录失败，请重新登录！<br>");
				request2.setAttribute("return_uri", servletPath);
				RequestDispatcher requestDispatcher=request2.getRequestDispatcher("/Test18/login.jsp");
				requestDispatcher.forward(request2, response2);
			}else {
				request2.setAttribute("msg", "您尚未登录，请登录！<br>");
				request2.setAttribute("return_uri", servletPath);
				RequestDispatcher requestDispatcher=request2.getRequestDispatcher("/Test18/login.jsp");
				requestDispatcher.forward(request2, response2);
			}
		}
		
	}

	public void destroy() {

	}

}
