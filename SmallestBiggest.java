//time comp = O(n)

import java.util.*;
public class SmallestBiggest{
	public static int getLargest(int numbers[]){
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
			}
			if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
		System.out.println("Smallest number is: "+smallest);
		return largest;
	}
	public static void main(String args[]){
		int numbers[]={1,2,3,4,5};

	System.out.println("Largest number is: "+getLargest(numbers));
	}
}