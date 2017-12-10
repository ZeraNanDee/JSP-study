package com.ZeraNanDee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ZeraNanDee.entity.User;
import com.ZeraNanDee.jdbc.CheckUserService;


public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheckUserService cus=new CheckUserService();
 
    public CheckServlet() {
        super();
        
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//提交的表单到达CheckServlet里，由CheckServlet进行判断，从表单获取的值进行判断，然后调用CheckUserService类里引用封装好的规范ConnectionFactory（JDBC）连接数据库，
		//然后调用User类里的各个属性信息，从而调用UserDao的接口方法，实现增删查改
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		RequestDispatcher dispatcher=null;
		String forward=null;//用于RequestDispatcher方法转发的URL，具体内容就是路径或者域名
		if (uname==null||upwd==null) {
			request.setAttribute("msg", "用户名或者密码为空");
			dispatcher=request.getRequestDispatcher("/Test16/error.jsp");
			dispatcher.forward(request, response);
		}else {
			User user=new User();
			user.setName(uname);
			user.setPassword(upwd);
			boolean b=cus.check(user);
			if (b) {
				forward="/Test16/success.jsp";
			}else {
				request.setAttribute("msg", "用户名或者密码输入错误，请重新输入!");
				forward="/Test16/error.jsp";
			}
			dispatcher=request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);
		}
		
		
	}

}
