package org.jaywu.beanFactory;

/**
 * Created by Administrator on 2014/9/28.
 */
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name ,Class requireType);

}
