//**********************************
//Guesser.java
//
//Player for Bulls and Cows game.
//
//by Stefanie Molin
//October 17, 2011
//*********************************
public class Guesser {
	public int bulls;
	public int cows;
	//declare instance variables
	
	public Guesser(){
		bulls=0;
		cows=0;
	}//sets bulls and cows to zero
	
	public int getBulls() {
		return bulls;
	}//returns the number of bulls the guess generated
	
	public int getCows() {
		return cows;
	}//returns the number of cows the guess generated
	
	public void incrementBulls(){
		bulls=bulls+1;
	}//increments the value of bulls
	
	public void incrementCows(){
		cows=cows+1;
	}//increments the value of cows
}//end class
