package com.zeng.customtag;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import com.zeng.customtag.bean.TestBean;

public class TestCustomBeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element element, ParserContext parserContext) {

		String id = element.getAttribute("id");
		String name = element.getAttribute("name");

		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClass(TestBean.class);
		beanDefinition.getPropertyValues().addPropertyValue("id", id);
		beanDefinition.getPropertyValues().addPropertyValue("name", name);
		parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);

		return beanDefinition;
	}
}