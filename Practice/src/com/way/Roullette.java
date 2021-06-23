package com.way;

import java.util.Random;

public class Roullette {

	//3)	Program Roulette game and determine if you win/loose having an initial amount. 
	//You need to also determine if its really your day to play more or not.	
		
	
	public enum Color{
		RED,BLACK;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int bet = 10;
		Color curr = roll();
		Color prev = curr;
		
		counter++;
		
		while(bet > 0 && bet < 25) {
			
			curr = roll();
			
			System.out.println(curr);
			
			if(prev == curr) {
				if(counter == 4) {
					bet--;
					System.out.println(" Loose " + bet);
					counter = 0;
				}else {
					counter++;
				}
			}else if(prev != curr) {
				if(counter == 4) {
					bet++;
					System.out.println(" Win " + bet);
					counter = 0;
				}else {
					counter = 1;
				}
				
			}
			
			
			prev = curr;
			
		}
		

	}
	
	static Color roll() {
		Random r = new Random();
		
		if(r.nextInt(2) == 0) {
			return Color.RED;
		}else {
			return Color.BLACK;
		}
		
	}

}
