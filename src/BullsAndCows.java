//*********************************
//BullsAndCows.java
//
//Runs the game of Bulls and Cows.
//
//by Stefanie Molin
//October 17, 2011
//*********************************
import java.util.Scanner;

public class BullsAndCows {
	private Scanner input;
	private Guesser g;
	private Oracle o;
	private String newGuess;
	private String randomNumber;
	private String oneGuess;
	private String twoGuess;
	private String threeGuess;
	private String fourGuess;
	private String oneAnswer;
	private String twoAnswer;
	private String threeAnswer;
	private String fourAnswer;
	
	public void play() {
		int again=1;
		int gamesPlayed=0;
		int best=1;
		int worst=1;
		int totalAttempts=0;
		while(again==1){
			o = new Oracle();
			randomNumber=o.choose();//oracle chooses number
			g = new Guesser();
			System.out.println("The oracle has choosen a 4 digit number without repeating digits.");
			System.out.println();
			System.out.println("Please enter a 4 digit number as your guess.");
			input = new Scanner(System.in);//input takes in user input
			newGuess=input.next();//get player guess
			
			//initialize the variables to compare
			oneAnswer=randomNumber.substring(0,1);
			twoAnswer=randomNumber.substring(1,2);
			threeAnswer=randomNumber.substring(2,3);
			fourAnswer=randomNumber.substring(3);
			
			oneGuess=newGuess.substring(0,1);
			twoGuess=newGuess.substring(1,2);
			threeGuess=newGuess.substring(2,3);
			fourGuess=newGuess.substring(3);
			
			int attempts=1;//player makes first attempt
			while(g.getBulls()!=4){
				//when the entire number is correct this while loop compares and tells the guesser their results

				//must set the values for the next while loop
				oneGuess=newGuess.substring(0,1);
				twoGuess=newGuess.substring(1,2);
				threeGuess=newGuess.substring(2,3);
				fourGuess=newGuess.substring(3);
				
				while(newGuess.length()!=4 || oneGuess.equals(twoGuess) || oneGuess.equals(threeGuess) || oneGuess.equals(fourGuess) || twoGuess.equals(threeGuess) || twoGuess.equals(fourGuess) || threeGuess.equals(fourGuess)){
						System.out.println("Please enter a 4 digit number without repeating digits.");
						newGuess=input.next();
						oneGuess=newGuess.substring(0,1);
						twoGuess=newGuess.substring(1,2);
						threeGuess=newGuess.substring(2,3);
						fourGuess=newGuess.substring(3);
				}//ensures that any other guesses made will be 4 digits long
				
				compare();
				if(g.getBulls()!=4){
					System.out.println("You have "+ g.getBulls() + " Bull(s)" +" and "+g.getCows()+" Cow(s). Please guess again.");
					newGuess=input.next();//until player gets 4 bulls, keep guessing
					attempts=attempts + 1;//increments the total attempts the player used
					g.bulls = 0;//after each guess the bulls and cows values must be reset
					g.cows = 0;
				}//end if
			}//end while
			System.out.println("Congratulations, " + newGuess + " was the correct number!");//player wins
			
			//statistics calculations
			gamesPlayed=gamesPlayed+1;//adds a game to total played
			if(gamesPlayed==1){
				best=attempts;
				worst=attempts;
				totalAttempts=attempts;//totals the attempts the guesser made in the first game
			}
			else{
				totalAttempts=totalAttempts + attempts;//totals the attempts the guesser made in all games
				if(attempts<=best)
					best=attempts;//stores the smallest as best
				if(attempts>=worst)
					worst=attempts;//stores the largest as worst
			}
			System.out.println();
			System.out.println("Would you like to play again? (1-yes / 0=no)");//ask to play again
			again=input.nextInt();//gets user's decision 
		}//end while
		System.out.println();
		System.out.println("Your best game took only " + best + " attempt(s)!");//print best game
		System.out.println("Your worst game took " + worst + " attempt(s)!");//print worst game
		System.out.println("Your average game takes " + ((double)totalAttempts)/((double)gamesPlayed) + " attempt(s)!");//print average game
	}//end method

	private void compare() {
		if(newGuess.equals(randomNumber)){
			g.bulls=4;
		}//checks to see if all the digits are bulls and the user guessed correctly.
		else{
			if(oneGuess.equals(oneAnswer)){
				g.incrementBulls();
			}
			else if(oneGuess.equals(twoAnswer)){
				g.incrementCows();
			}
			else if(oneGuess.equals(threeAnswer)){
				g.incrementCows();
			}
			else if(oneGuess.equals(fourAnswer)){
				g.incrementCows();
			}
			else {
				g.bulls=0;
				g.cows=0;
			}//checks to see if the first digit from the user is a bull, cow, or nothing.
			
			if(twoGuess.equals(twoAnswer)){
				g.incrementBulls();
			}
			else if(twoGuess.equals(oneAnswer)){
				g.incrementCows();
			}
			else if(twoGuess.equals(threeAnswer)){
				g.incrementCows();
			}
			else if(twoGuess.equals(fourAnswer)){
				g.incrementCows();
			}
			else {
				g.bulls=g.bulls;
				g.cows=g.cows;
			}//checks to see if the second digit from the user is a bull, cow, or nothing.
			
			if(threeGuess.equals(threeAnswer)){
				g.incrementBulls();
			}
			else if(threeGuess.equals(oneAnswer)){
				g.incrementCows();
			}
			else if(threeGuess.equals(twoAnswer)){
				g.incrementCows();
			}
			else if(threeGuess.equals(fourAnswer)){
				g.incrementCows();
			}
			else {
				g.bulls=g.bulls;
				g.cows=g.cows;
			}//checks to see if the third digit from the user is a bull, cow, or nothing.
			
			if(fourGuess.equals(fourAnswer)){
				g.incrementBulls();
			}
			else if(fourGuess.equals(oneAnswer)){
				g.incrementCows();
			}
			else if(fourGuess.equals(twoAnswer)){
				g.incrementCows();
			}
			else if(fourGuess.equals(threeAnswer)){
				g.incrementCows();
			}
			else {
				g.bulls=g.bulls;
				g.cows=g.cows;
			}//checks to see if fourth digit from user is a bull, cow, or nothing.
		}//end else
	}//end compare method
}//end class
