package com.binarysearch;

public class VanilaBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,4,7,9,10,15,16,20};
		
		System.out.println("********Binary Search*************");
		System.out.println(find(arr,2));//0
		System.out.println(find(arr,7));//2
		System.out.println(find(arr,15));//5
		System.out.println(find(arr,20));//7
		
		System.out.println("*****Greater Element****************");
		
		System.out.println(firstGreaterElement(arr,1));//2
		System.out.println(firstGreaterElement(arr,2));//4
		System.out.println(firstGreaterElement(arr,7));//9
		System.out.println(firstGreaterElement(arr,15));//16
		System.out.println(firstGreaterElement(arr,20));//-1
		
		System.out.println("*******First Occurnace**************");
		
		System.out.println(findFirstOccurrence(new int[] {1, 3, 3, 3, 3, 6, 10, 10, 10, 100},3));//1
		System.out.println(findFirstOccurrence(new int[] {1, 3, 3, 3, 3, 6, 10, 10, 10, 100},10));//6
		
		System.out.println("*******find SQRT**************");
		System.out.println(findSqrRoot(144)); //12
		System.out.println(findSqrRoot(64)); //8
		System.out.println(findSqrRoot(63)); //7
		System.out.println(findSqrRoot(65)); //8
		
		System.out.println("*******Minimum in rotated sorted array**************");
		
		System.out.println(findMinRotated(new int[] {30, 40, 50, 10, 20})); //3
		System.out.println(findMinRotated(new int[] {0, 1, 2, 3, 4, 5})); //0
		System.out.println(findMinRotated(new int[] {0})); //0
		
		System.out.println("*******Mountain Peak**************");
		System.out.println(peakOfMountainArray(new int[] {0, 1, 2, 3, 2, 1, 0})); //3
		System.out.println(peakOfMountainArray(new int[] {0, 10, 3, 2, 1, 2})); //1
		System.out.println(peakOfMountainArray(new int[] {0, 10, 0})); //1
	}
	
	
	/**
	 * @param arr
	 * @param target
	 * @return
	 */
	static int find(int[] arr, int target) {
		
		int l= 0;
		int r = arr.length-1;
		
		while(l <= r) {
			
			int mid = (l+r)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
			
		}
		
		return -1;
	}
	
	
	static int firstGreaterElement(int[] arr, int target) {
		
		int l=0;
		int r = arr.length - 1;
		int res = -1;
		
		while(l <= r) {
			int mid = (l+r)/2;
			
			if(arr[mid] > target) {
				res = arr[mid];
				r = mid - 1;
			}else {
				l = mid + 1;
			}
			
			
		}
		
		return res;
	}
	
	
	
	public static int findFirstOccurrence(int[] arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        
        int l=0;
        int r=arr.length-1;
        int occ = -1;
        
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                occ = mid;
                r = mid - 1;
            }else if(arr[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
        return occ;
    }
	
	static int findSqrRoot(int n) {
			
		int sqr = -1;
		int l = 0; int r = n/2;
		
		while(l<=r) {
			
			int mid = (l + r)/2;
			
			if(mid*mid == n) {
				return mid;
			}else if(mid*mid < n) {
				sqr = mid;
				l = mid + 1;
			}else {
				r = mid - 1;
			}
			
		}
		
		return sqr;
	}
	
	  public static int findMinRotated(int[] arr) {
	        // WRITE YOUR BRILLIANT CODE HERE
	        
	        int l=0;
	        int r = arr.length-1;
	        int index = -1;
	        
	        while(l <= r){
	            int mid = (l+r)/2;
	            
	            if(arr[mid] <= arr[arr.length-1]){
	                index = mid;
	                r = mid - 1;
	            }else{
	                l = mid + 1;
	            }
	            
	            
	        }
	        
	        
	        return index;
	    }
	
	  
	  
	  public static int peakOfMountainArray(int[] arr) {
	        // WRITE YOUR BRILLIANT CODE HERE
	        
	        int l = 0;
	        int r = arr.length - 1;
	        int index = -1;
	        
	        while(l <= r){
	            int mid = (l+r)/2;
	            
	            if(mid == arr.length-1 || arr[mid] > arr[mid + 1]){
	                index = mid;
	                
	                 r = mid - 1;
	            }else{
	               l = mid + 1;
	            }
	        
	        }
	        
	        
	        return index;
	    }


}
