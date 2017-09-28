package Pizzeria;

public abstract class Pizza {
	
	protected String pizza = "Pizza";
//	double koszt = 0;
	
	public String getName() {
		return pizza;
	}
	
	public abstract double koszt();
	
}
