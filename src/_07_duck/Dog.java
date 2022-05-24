package _07_duck;

import javax.swing.JOptionPane;

public class Dog {

	int numberOfFriends;
	String favoriteToy;
	void bark() { JOptionPane.showMessageDialog(null, "Bark!");}
	void tailWag() { JOptionPane.showMessageDialog(null, "*Wags tail*");}
	
	Dog(String favoriteToy, int numberOfFriends) {
	       this.favoriteToy = favoriteToy;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
	
	
}
