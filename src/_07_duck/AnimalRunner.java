package _07_duck;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck ducky = new Duck("Bread", 9);
		
		ducky.quack();
		ducky.waddle();
		System.out.println(ducky.numberOfFriends);
		
		Dog Fido = new Dog ("Tennis Ball", 12);
		
		Fido.bark();
		Fido.tailWag();
		System.out.println(Fido.favoriteToy);
	}

}
