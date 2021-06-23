package com.way;

public class GambllerFallacy {

//2) A coding problem to simulate the coin game and gambler's 
//fallacy (if they are 4 Heads in a row, gambler would bet on Tail, and vice versa).
	
//3)	Program Roulette game and determine if you win/loose having an initial amount. 
//You need to also determine if its really your day to play more or not.	
	
	//CAAAYYXXXXXAIIIVV
	//C1A3Y2X5A1I3V2
	
	public enum Coin{
		HEAD,TAIL
	}

	public static void main(String args[]) {
		
		int counter = 0;
		
		System.out.println(encode("CAAAYYXXXXXAIIIVV"));
		
		
		System.out.println(decode("C1A3Y2X5A1I3V2"));
	}
	
	
	static String encode(String s) {
		
		StringBuffer sb = new StringBuffer();
		char prev =  s.charAt(0);
		int counter = 1;
		
		for(int i =1;i<s.length();i++) {
			
			if(prev == s.charAt(i)) {
				counter++;
				
			}else {
				sb.append(prev).append(counter);
				counter=1;
			}
			prev = s.charAt(i);
		}
		
		if(counter > 0) {
			sb.append(prev).append(counter);
		}
		
		return sb.toString();
	}
	
	static String decode(String s) {
		
		StringBuffer sb = new StringBuffer();
		char prev =  s.charAt(0);
		
		for(int i =1;i<s.length();i=i+2) {
			
			int count = Integer.parseInt( s.substring(i,i+1)  ) ;
			
			System.out.println(count);
			
			for(int j=0;j< count; j++) {
				sb.append(s.charAt(i-1));
			} 
			
		}

		
		return sb.toString();
	}
	
	public static void main2(String args[]) {
		
		int counter = 0;
		int bet = 25;
		
		Coin prevFlip = null; 
		
		Coin toss = tossCoin();
		prevFlip = toss;
		
		counter++;
		
		System.out.println(prevFlip + " - " + counter );
		
		for(int i=0;i<15000 && bet>0;i++) {
			
			toss = tossCoin();
			
			System.out.println(toss);
			
			
			if(counter == 4 && prevFlip == toss) {
				bet--;
				counter = 1;
				System.out.println("Continous bet loss " + prevFlip + " - " + counter + " - " + bet );
			}else if(counter == 4 && prevFlip != toss) {
				bet++;
				counter = 1;
				System.out.println("Continous bet win " + prevFlip + " - " + counter + " - " + bet );
			} else if(prevFlip == toss && counter < 4) {
				counter++;
			}else if(prevFlip != toss && counter < 4){
				counter = 1;
			}
			
			System.out.println(counter);
			
			prevFlip = toss;
		}
		
		
		
	}
	
	
	
	public static void main1(String args[]) {
	
		int contHeadcount = 0;
		int contTailcount = 0;
		
		int bet = 25;
		
		int a[] = new int[2];
		
		Coin prevFlip = null; 
		
		Coin toss = tossCoin();
		prevFlip = toss;
		
		if(prevFlip == Coin.HEAD) {
				contHeadcount++;
		}else {
			contTailcount++;
		}
		
		System.out.println(contHeadcount + " -- " + contTailcount);
		
		for(int i=0;i<99;i++) {
		
			
			
			 toss = tossCoin(); 
		
				if( toss == Coin.HEAD) {
					System.out.println(toss + " - " + "HEAD");
				}else {
					System.out.println(toss + " - " + "TAIL");
				}
			 
			
			if(contHeadcount == 4 && toss == Coin.HEAD) {
				bet--;
				System.out.println("Continous bet head loss " + contHeadcount + " - " + bet );
				contHeadcount = 0;
				contTailcount = 0;
			}else if(contHeadcount == 4 && toss == Coin.TAIL) {
				
				 bet++;
				 System.out.println("Continous bet head win " + contHeadcount + " - " + bet );
				 contHeadcount = 0;
					contTailcount = 0;
			}else if(contTailcount == 4 && toss == Coin.TAIL) {
				
				 bet--;
				 System.out.println("Continous bet tail loss  " + contTailcount + " - " + bet );
				 contHeadcount = 0;
					contTailcount = 0;
			}else if(contTailcount == 4 && toss == Coin.HEAD) {
				
				 bet++;
				 System.out.println("Continous bet tail win " + contTailcount + " - " + bet );
				 contHeadcount = 0;
					contTailcount = 0;
			}
			
			
			
			if(prevFlip  != toss) {
				if(toss == Coin.HEAD) {
					contHeadcount=1;
					contTailcount = 0;
				}else {
					contHeadcount=0;
					contTailcount = 1;
				}
				
				
			} else if(prevFlip == toss && prevFlip == Coin.HEAD) {
				contHeadcount++;
			}else if( prevFlip == toss && prevFlip == Coin.TAIL){
				contTailcount++;
			}
			
			System.out.println(contHeadcount + " -- " + contTailcount);
			
			prevFlip = toss;
			
		
		
		}
		
	}
	
	
	static Coin tossCoin() {
		int toss = ((int)(Math.random() *2)) ;
		
		if(toss == 0) 
			return Coin.HEAD;
		else
			return Coin.TAIL;
	}
	
}
