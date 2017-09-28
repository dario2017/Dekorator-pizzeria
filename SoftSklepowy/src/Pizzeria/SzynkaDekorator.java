package Pizzeria;

public class SzynkaDekorator extends Dekorator {
	
	String dodatek = "szynka";
	Pizza pizza;
	double cena = 3.5;
	
	public SzynkaDekorator (Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getName() {
		return pizza.getName() + " + " + dodatek;
	}
	
	public double koszt() {
		return pizza.koszt() + cena;
	}
	
}
