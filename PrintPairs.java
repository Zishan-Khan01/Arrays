class PrintPairs{
	public static void printPairs(int numbers[]){
		int totalPairs = 0;
		for(int i=0; i<numbers.length-1; i++){
			for(int j=i+1; j<numbers.length; j++){
				int curr = numbers[i];
				System.out.print("(" + curr + "," + numbers[j] + ") ");
				totalPairs++;		//for each new pair totalPairs++
			}
			System.out.println();
		}
		System.out.println("Total Pairs = " + totalPairs);
	}

	public static void main(String args[]){
		int numbers[] = {2, 4, 6, 8, 10};
		printPairs(numbers);
	}
}