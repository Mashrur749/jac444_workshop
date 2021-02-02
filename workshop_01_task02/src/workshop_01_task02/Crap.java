
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

public class Crap {
	private Die dieOne;
	private Die dieTwo;
	private int crapScore;
	private boolean gameFinished;
	private boolean isWin;
	private int prevScore;
	
	Crap(){
		this.dieOne = new Die();
		this.dieTwo = new Die();

		this.crapScore = 0;
		this.prevScore = 0;

		this.gameFinished = false;
		this.isWin = false;
	}
	
	//rolls both the dices and collects the result of dices and stores to crapScore variable
	public int play() {
		this.crapScore = dieOne.roll() + dieTwo.roll();
		
		System.out.println(String.format("You rolled %d + %d = %d", dieOne.getCurr(), dieTwo.getCurr(), this.crapScore));
		
		setGameState();
		return crapScore;
	}

	//a private function, that sets game state
	private void setGameState() {
		if(this.crapScore ==  2 || this.crapScore ==  3 || this.crapScore ==  12) {
			//lose
			System.out.println("Craps, Better Luck Next Time, You lose");
			gameFinished = true;
		} else if((this.crapScore > 7 && this.crapScore < 11) || this.crapScore == this.prevScore) {
			//win
			gameFinished = true;
			isWin = true;
			System.out.println("Congratulations, You win");
		} else {
			//record gamePoint
			this.prevScore = this.crapScore;
			System.out.println(String.format("Point is (established) set to %d", this.prevScore));
			
		}	
	}
	
	public boolean isGameFinished(){
		return this.gameFinished;
	}
	
	
	

}
