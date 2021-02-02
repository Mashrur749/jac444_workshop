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

package workshop01_task01;


public class MaxLocation {
	private int row;
	private int col;
	private double maxValue;
	private boolean initialized;

	MaxLocation() {
		this.row = 0;
		this.col = 0;
		this.maxValue= 0;
		this.initialized = false;
	}
	
	//takes a two dimensional array and finds the location of the highest value
	MaxLocation(double set[][]){
		this.maxValue = set[0][0];
		for (int i = 0; i < set.length; i++) {
			for (int j = 0; j < set[i].length; j++) {
				if(this.maxValue < set[i][j]) {
					this.row = i;
					this.col = j;
					this.maxValue= set[i][j];
					this.initialized = true;
				}
			}
		}
	}
	
	public void set(double set[][]) {
		this.maxValue = set[0][0];
		for (int i = 0; i < set.length; i++) {
			for (int j = 0; j < set[i].length; j++) {
				if(this.maxValue < set[i][j]) {
					this.row = i;
					this.col = j;
					this.maxValue= set[i][j];
					this.initialized = true;
				}
			}
		}
	}
	
	@Override
    public String toString() { 
		String report = "";
		
		if(this.initialized) {
			report = String.format("The location of the largest element is %.2f at (%d, %d)", this.maxValue, this.row, this.col);
		}else {
			report = "The object wasn't fed data, use set function to feed data to the object";
		}
		
        return report; 
    } 
}
