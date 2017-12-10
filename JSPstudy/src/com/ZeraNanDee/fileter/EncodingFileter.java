package com.ZeraNanDee.fileter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

@WebFilter("/EncodingFileter")
public class EncodingFileter implements Filter {//用过滤器解决请求时页面的中文乱码问题
	private String charEncoding = null;

	public EncodingFileter() {

	}

	public void init(FilterConfig fConfig) throws ServletException {
		charEncoding = fConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
if (!charEncoding.equals(request.getCharacterEncoding())) {//如果当前编码与servlet编码不一致
	request.setCharacterEncoding(charEncoding);//那就将当前的servlet请求中编码设置成当前默认的编码
}
response.setCharacterEncoding(charEncoding);
		chain.doFilter(request, response);
	}

	public void destroy() {

	}
}
