package com.zeng.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class TestNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("custom",
				new TestCustomBeanDefinitionParser());
	}
}