package dependencyinjection;

public class Laptop {

	private int id;
	private String name;
	
	private Charger charger;

	
	public Laptop(int id, String name, Charger charger) {
		super();
		this.id = id;
		this.name = name;
		this.charger = charger;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", charger=" + charger + "]";
	}
	
	
	
	
	
	
}
