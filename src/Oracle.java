//**********************************
//Oracle.java
//
//Computer class for Bulls and Cows
//
//by Stefanie Molin
//October 17, 2011
//**********************************

public class Oracle {
	private int first;
	private int second;
	private int third;
	private int fourth;
	public String number;
	
	public String choose() {
		//picks 4 different random numbers and turns them into a four digit string.
		first=(int)(Math.random()*9);
		int n=(int)(Math.random()*9);
		while(n==first){
			n=(int)(Math.random()*9);
		}//end while
		second=n;
		int m=(int)(Math.random()*9);
		while(m==first || m==second){
			m=(int)(Math.random()*9);
		}//end while
		third=m;
		int l=(int)(Math.random()*9);
		while(l==first || l==second || l==third){
			l=(int)(Math.random()*9);
		}//end while
		fourth=l;
		String f=Integer.toString(first);
		String s=Integer.toString(second);
		String t=Integer.toString(third);
		String r=Integer.toString(fourth);
		number=f+s+t+r;//turn each integer into a string and from there into a single string
		return number;//returns the oracle's number
	}//end choose method
}//end class
