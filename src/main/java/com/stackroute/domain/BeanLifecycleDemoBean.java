package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    //    to destory bean
    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    //    custom init method
    public void customInit() {
        System.out.println("Custom Init Method ");
    }

    //    custom destroy method
    public void customDestroy() {
        System.out.println("Custom Destroy method ");
    }
}
