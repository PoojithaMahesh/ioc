package day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("new.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
//	Mobile mobile=beanFactory.getBean("mobile",Mobile.class);
//	mobile.used();
	Laptop laptop=beanFactory.getBean("laptop",Laptop.class);
	laptop.used();
}
}
