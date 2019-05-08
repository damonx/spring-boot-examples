package com.neo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
//	@Bean
//	public RemoteIpFilter remoteIpFilter() {
//		return new RemoteIpFilter();
//	}
//
//	@Bean
//	public FilterRegistrationBean testFilterRegistration() {
//
//		final FilterRegistrationBean registration = new FilterRegistrationBean();
//		registration.setFilter(new MyFilter());
//		registration.addUrlPatterns("/*");
//		registration.addInitParameter("paramName", "paramValue");
//		registration.setName("MyFilter");
//		registration.setOrder(1);
//		return registration;
//	}

//	public class MyFilter implements Filter {
//		@Override
//		public void destroy() {
//			// TODO Auto-generated method stub
//		}
//
//		@Override
//		public void doFilter(final ServletRequest srequest, final ServletResponse sresponse, final FilterChain filterChain)
//				throws IOException, ServletException {
//			final HttpServletRequest request = (HttpServletRequest) srequest;
//			System.out.println("this is MyFilter,url :" + request.getRequestURI());
//			filterChain.doFilter(srequest, sresponse);
//		}
//
//		@Override
//		public void init(final FilterConfig arg0) throws ServletException {
//			// TODO Auto-generated method stub
//		}
//	}
}
