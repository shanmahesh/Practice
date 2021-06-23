package com.vin;

public class LLSumTwoNum {

			//Input: l1 = [2,4,3], l2 = [5,6,4]
			//Output: [7,0,8]
			//Explanation: 342 + 465 = 807.
	
			//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
			//Output: [8,9,9,9,0,0,0,1]
	
	
	public static void main(String a[]) {
		
		System.out.println( 9999999 + 9999);
		
		//ListNode li1 = new ListNode(2,new ListNode(4,new ListNode(3)));
		
		//ListNode li2 = new ListNode(5,new ListNode(6,new ListNode(4)));
		
		ListNode li1 = new ListNode(9,new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9)))))));
		
		ListNode li2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
		
		
		ListNode result = new ListNode(); 
		ListNode curr =  result;
		int next = 0;
		
		while(li1 != null || li2 !=null) {
			
			if(li1 != null) {
				next += li1.val;
				li1 = li1.next; 
			}
			
			if(li2 != null) {
				next += li2.val;
				li2 = li2.next; 
			}
			
			curr.val = next %10;
			next = next / 10;
			
			if(next == 1) {
				curr.next = new ListNode();
	            curr.next.val = 1;
			}else if(li1 != null || li2 !=null) {
				curr.next = new ListNode();
			}
			
			curr = curr.next;
			
		}
		
		while(result != null) {
			System.out.println( result.val );
			result = result.next;
		}
		
		
	}
	
	
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

