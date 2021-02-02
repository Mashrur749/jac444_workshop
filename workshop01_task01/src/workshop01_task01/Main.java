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

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		int numRow;
		int numCol;
		
		double data[][];


		Scanner scanner = new Scanner(System.in); 

		System.out.print("Enter the number of rows and columns in the array:  ");

		
		
		numRow = scanner.nextInt();  // Read user input
		numCol = scanner.nextInt();  // Read user input


		//initializes data array
		data = new double[numRow][numCol];

		//ask for user input for two dimensional array
		
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {		    	 
				data[i][j] = scanner.nextDouble();
			}
		}		

		//initialize a MaxLocation object
		MaxLocation maxLoc = new MaxLocation(data);
		
		//calls overridden toString function to customize console log
		System.out.println(maxLoc);

	}







}
