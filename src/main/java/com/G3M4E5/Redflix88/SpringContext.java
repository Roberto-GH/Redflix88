/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.G3M4E5.Redflix88;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Londoño
 */

@Component
public class SpringContext implements ApplicationContextAware {
    
    private static ApplicationContext context;
    
    public static <T extends Object> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        SpringContext.context = ac; 
    }
    
}
