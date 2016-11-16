package com.mkt.mytest.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mkt.mytest.config.AdminConfig;
import com.mkt.mytest.config.HibernateConfiguration;
import com.mkt.mytest.config.MvcConfig;

public class MvcWebApplicationInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

	  @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[]{HibernateConfiguration.class};
	    }

	 @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class[] {MvcConfig.class};
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[]{"/"};
	    }

}