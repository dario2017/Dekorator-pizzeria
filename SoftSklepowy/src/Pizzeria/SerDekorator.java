package Pizzeria;

public class SerDekorator extends Dekorator {
	String dodatek = "ser";
	double cena = 2.15;
	
	Pizza pizza;
	
	public SerDekorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getName() {
		return pizza.getName() + " + " + dodatek;
	}
	
	public double koszt() {
		return pizza.koszt() + cena;
	}
}
