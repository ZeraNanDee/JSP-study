package com.ZeraNanDee.fileter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/Fileterone")
public class Fileterone implements Filter {


    public Fileterone() {
      System.out.println("=====过滤器1构造函数被调用=====");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("初始化方法");
		String initParam=fConfig.getInitParameter("param");
		System.out.println("param=="+initParam);
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("过滤器1开始拦截");
		chain.doFilter(request, response);
		System.out.println("过滤器1结束拦截");
	}


	public void destroy() {
		System.out.println("======过滤器1被销毁======");
	}


}
