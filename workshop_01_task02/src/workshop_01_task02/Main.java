/**********************************************
 * Workshop #01 
 * Course: JAC444 - 6
 * Last Name: Rahman
 * First Name: Musaddiqur Rahman
 * ID:106932189
 * Section: JAC444NBB
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Musaddiqur Rahman
 * Date: 1st Jan, 2021
 * **********************************************/

package workshop_01_task02;

public class Main {
	public static void main(String[] args) {
		Crap game = new Crap();
		
		//play until the game is finished
		while(!game.isGameFinished()) {
			game.play();
		}	
	}

}
