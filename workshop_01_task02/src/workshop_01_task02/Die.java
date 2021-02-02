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

import java.util.Random;

public class Die {
	private int die[] = {1,2,3,4,5,6};
	private int currDie = 0;
	
	public int roll() {
		Random rand = new Random();
		this.currDie = this.die[rand.nextInt(6)];
		return currDie;
	}
	
	public int getCurr() {
		return this.currDie;
	}
	
}