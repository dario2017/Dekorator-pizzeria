package Pizzeria;

public class Main {
	public static void main(String[] args) {
		Pizza zamowienie1 = new MalaPizza();
		Pizza zamowienie2 = new SredniaPizza();
		Pizza zamowienie3 = new DuzaPizza();
		
		System.out.println(zamowienie1.getName() + " " + zamowienie1.koszt());
		System.out.println(zamowienie2.getName() + " " + zamowienie2.koszt());
		System.out.println(zamowienie3.getName() + " " + zamowienie3.koszt());
		
		zamowienie1 = new SerDekorator(zamowienie1);
		System.out.println(zamowienie1.getName() + " " + zamowienie1.koszt());
		
		zamowienie3 = new SerDekorator(zamowienie3);
		zamowienie3 = new SzynkaDekorator(zamowienie3);
		System.out.println(zamowienie3.getName() + " " + zamowienie3.koszt());
	}
}