package com.nf.njh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
@EnableWebMvc
@ComponentScan({"com.nf.njh.controller","com.nf.njh.advice"})
public class MvcConfig implements WebMvcConfigurer {

    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
registry.jsp("/WEB-INF/views/",".jsp");
    }

    //调整时间格式
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }

        //拦截器，拦截页面
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration interceptorRegistration = registry.addInterceptor();
    }



    //
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //添加静态文件的格式ant格式
        ResourceHandlerRegistration registration = registry.addResourceHandler("/static/**");
       //静态文件的
        registration.addResourceLocations("classpath:/static/");
    }


}
