package com.way;

import java.util.Random;

//2) A coding problem to simulate the coin game and gambler's 
//fallacy (if they are 4 Heads in a row, gambler would bet on Tail, and vice versa).

public class Toss {

	public enum Coin{
		HEAD,TAIL;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		int counter = 0;
		int bet = 10;
		
		Coin flip = toss();
		Coin prev = flip;
		counter++;
		while(bet >0 && bet <25 ){
			flip = toss();
			
			System.out.println(flip);
		
			if(prev == flip) {
				if(counter == 4) {
					bet--;
					counter=0;
					System.out.println("Loose " + bet);
				}else {
					counter++;
				}
			}else if(prev != flip) {
				
				if(counter == 4) {
					bet++;
					counter=0;
					System.out.println("Win " + bet);
				}else {
					counter=1;
				}
			}
			
			System.out.println(counter);
			
			prev = flip;
		}
		
	}
	
	static Coin toss() {
		
		Random r = new Random();
		
		if(r.nextInt(2) == 0)
			return Coin.HEAD;
		else
			return Coin.TAIL;
		
	}
	
}
