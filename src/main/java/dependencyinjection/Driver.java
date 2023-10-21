package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("d.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Laptop laptop=beanFactory.getBean("laptop",Laptop.class);
	Charger charger=beanFactory.getBean("c",Charger.class);
	System.out.println(laptop);
	System.out.println(charger);
}
}
