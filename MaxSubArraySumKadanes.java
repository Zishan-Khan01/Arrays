//Kadanes algo Approach for maxSubArraySum{Most optimized}
//time comp=O(n) 

public class MaxSubArraySumKadanes{
	public static void maxSubArraySumPS(int numbers[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];
		
		prefix[0] = numbers[0];
		//calculate prefix array
		for(int i=1; i<numbers.length; i++){
			prefix[i] = prefix[i-1] + numbers[i];
		}
		for(int i=0; i<numbers.length; i++){
			int start = i;
			for(int j=i; j<numbers.length; j++){
				int end = j;
				//what if start = 0
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];;
				
				//for(int k=start; k<=end; k++){
				//	System.out.print(numbers[k]+" ");
				//	//subArray sum
				//	currSum += numbers[k];
				//}
				//System.out.println(": " + currSum);
				
				if(currSum > maxSum){
					maxSum = currSum;
				}
			}
		}
		System.out.println("Max Sum: " + maxSum);
	}

	public static void maxSubArraySumKadanes(int numbers[]){
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		for(int i=0; i<numbers.length; i++){
			currSum = currSum + numbers[i];
			if(currSum < 0){
				currSum = 0;
			}
			maxSum = Math.max(currSum, maxSum);
		}
		System.out.println("Our max subarray sum is : " + maxSum);

		//if currSum is negative(<0)
		
		


		
	}

	public static void main(String args[]){
		int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		maxSubArraySumKadanes(numbers);		
	}
}