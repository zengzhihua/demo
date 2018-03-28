package com.zeng.customtag;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zeng.customtag.bean.TestBean;

/**
 * 
 * @author luncene 
 * spring 自定义标签
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		String xml = "classpath:test.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { xml });
		TestBean bean = (TestBean) context.getBean("testCustom");
		System.out.println(bean.getName());
	}
}