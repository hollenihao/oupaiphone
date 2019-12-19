package com.nf.njh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SystemConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 项目中只有一个spring容器那么只需要下面方法返回有值即可，getServletConfigClasses返回null即可
     *
     * @return
     */

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class} ;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }



}
