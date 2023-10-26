package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	public void used() {
		System.out.println("it is used to talk with gf/bf/parents/friends");
	}
	@Value("1")
	private int id;
	@Value("ONEPLUS")
	private String name;
	@Value("BLUE")
	private String color;
	
	@Autowired
	private Charger charger;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + ", charger=" + charger + "]";
	}
	
	
}