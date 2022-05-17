package _07_duck;

import javax.swing.JOptionPane;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	void quack(){ JOptionPane.showMessageDialog(null, "Quack!");}
	void waddle(){JOptionPane.showMessageDialog(null, "*Waddle Waddle*");}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
	
	
	
	
	
	
	
}
