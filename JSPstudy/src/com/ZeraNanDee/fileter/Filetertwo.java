package com.ZeraNanDee.fileter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/Filetertwo")
public class Filetertwo implements Filter {

    public Filetertwo() {
    	  System.out.println("=====过滤器2构造函数被调用=====");
      
    }
public void init(FilterConfig fConfig) throws ServletException {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("过滤器2开始拦截");
		chain.doFilter(request, response);
		System.out.println("过滤器2结束拦截");
	}

	public void destroy() {
		System.out.println("======过滤器2被销毁======");
	}

	

}
