package org.example.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //здесь находится конфигурационный класс нашего спринг-приложения, от которого будет создаваться application context
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    //указываем какие адреса будет обрабатывать наш Dispatcher
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
