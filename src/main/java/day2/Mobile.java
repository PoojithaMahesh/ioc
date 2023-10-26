package day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	public void used() {
		System.out.println("used to talk");
	}
	@Value("1")
	private int id;
	@Value("IPHONEEEE")
	private String name;
	@Value("Red")
	private String color;
	
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	

}
