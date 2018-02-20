
//*************************************
//BullsAndCowsTest.java
//
//Tests the BullsAndCows game.
//
//by Stefanie Molin
//October 17, 2011
//*************************************

public class BullsAndCowsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Get ready for a thrilling game of Bulls and Cows!");
		System.out.println();
		BullsAndCows b = new BullsAndCows();//creates new bulls and cows called b
		b.play();//plays the game
		System.out.println();
		System.out.println("Thank you for playing.");
	}//end main

}//end class