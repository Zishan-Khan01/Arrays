//Brute Force Approach
//time comp=O(n cube)

public class MaxSubArraySumBF{
	public static void maxSubArraySumBF(int numbers[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++){
			int start = i;
			for(int j=i; j<numbers.length; j++){
				int end = j;
				currSum = 0;
				for(int k=start; k<=end; k++){
					System.out.print(numbers[k]+" ");
					//subArray sum
					currSum += numbers[k];
				}
				System.out.println(": " + currSum);
				if(currSum > maxSum){
					maxSum = currSum;
				}
			}
		}
		System.out.println("Max Sum: " + maxSum);
	}

	public static void main(String args[]){
		int numbers[] = {2, 4, 6, 8, 10};
		maxSubArraySumBF(numbers);		
	}
}