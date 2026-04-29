//time comp = O(n)

public class LinearSearch{
	public static int linearSearch(int numbers[], int key){
		for(int i=0;i<numbers.length-1;i++){
			if(numbers[i]==key){
				return i;
			}
		}
		return -1;
	}


	public static void main(String args[]){
		int numbers[]={1,3,2,4,5}; 
		int key=3;
		int index=linearSearch(numbers, key);
		if(index == -1){
			System.out.println("Index not found");
		}else{
			System.out.println("Key is at index "+index);
		}
	}
}