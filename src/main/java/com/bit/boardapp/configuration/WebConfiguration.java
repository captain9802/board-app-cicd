package com.bit.boardapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 리액트 라우트 요청시 index.html로 가도록 설정
        registry.addViewController("/app/**")
                .setViewName("forward:/index.html");
    }
}
