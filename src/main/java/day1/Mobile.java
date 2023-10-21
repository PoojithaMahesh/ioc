package day1;

public class Mobile {
private int id;
private String name;
private String brand;
@Override
public String toString() {
	return "Mobile [id=" + id + ", name=" + name + ", brand=" + brand + "]";
}
public Mobile(int id, String name, String brand) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
}


	
}
