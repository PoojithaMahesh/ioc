package day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("new.xml");
	Mobile mobile=context.getBean("mobile",Mobile.class);
	System.out.println(mobile);
//	Laptop laptop=beanFactory.getBean("laptop",Laptop.class);
//	laptop.used();
}
}
