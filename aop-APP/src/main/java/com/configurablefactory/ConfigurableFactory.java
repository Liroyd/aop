package com.configurablefactory;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.access.SingletonBeanFactoryLocator;
import org.springframework.context.ApplicationContext;

public final class ConfigurableFactory {

    String MODULE_BEAN_REF_FACTORY_XML_CLASSPATH = "classpath*:%s-beanRefFactory.xml";
    String MODULE_ID = "aop";
    String BEAN_REF_FACTORY_XML_CLASSPATH = String.format(MODULE_BEAN_REF_FACTORY_XML_CLASSPATH, MODULE_ID);

    private static final ConfigurableFactory INSTANCE = new ConfigurableFactory();
    private final ApplicationContext beanFactory;

    private ConfigurableFactory() {
        BeanFactoryLocator beanFactoryLocator = SingletonBeanFactoryLocator.getInstance(BEAN_REF_FACTORY_XML_CLASSPATH);
        BeanFactoryReference beanFactoryReference = beanFactoryLocator.useBeanFactory(MODULE_ID);

        beanFactory = (ApplicationContext) beanFactoryReference.getFactory();
    }

    public static ConfigurableFactory getInstance() {
        return INSTANCE;
    }

    public ApplicationContext getBeanFactory() {
        return beanFactory;
    }
}