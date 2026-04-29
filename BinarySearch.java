//time comp = O(log n base 2)
/*Note:- in order for us to be able to use binary search we need to meet 2 conditions, the first is random access, meaning that we are able to jump to any index of our collection in const time & this is possible when using an array or a vector but not possible with other data structures such as LL, & the second condition is that our collection of elements needs to be sorted. If the arr we are given isn't sorted then we are no longer able to perform binary search on it and the algorithm will fall apart. Here is where bin search runs into 2 problems, the first is that in order to know if an array is sorted u have to look at every element in the array in which case u may as well perform the linear search therefore you may be tempted to just go ahead and sort the array however this takes even longer as sorting algo on average have a time complexity of O(nlogn), which is even worse than linear search. Beacuse of this if U plan on only searching your data once then the linear search is the correct choice, however if the data is intended to be searched multiple times then it's wothwhile spending the time to sort it, enabling the much more efficient binary search algo.one approach of doing this is to sort your data once then when new data comes in rather than resorting your data set you instead insert it into the correct place, making use of binary search to determine where that is. In fact to improve the process of inserting new data, a number of data structures have been designed, based on binary search such as the binary search tree and the B tree, which is actually what databases use to store indexes and enables them to perform searches across millions of rows in fractions of a second. So far we've only showed binary search being used with arrays of integers however you can use binary search and indexing with any type that can be compared and ordered such as strings allowing you to search for values such as email addresses or usernames all of this means that binary search and its derived data structures have many real world applications such as searching for files in your operating system or looking up the most recent videos from your favorite content creator.*/
//Note:- Arr must be sorted in advance for binary search to work
//for an arr of 1 million elements it takes only 20 iterations to search the given element, it enables us to search large amount of data in very short amount of time
//formula for counting iterations in binary search for n elements array:- log(n)+1


public class BinarySearch{
	public static int binarySearch(int numbers[], int key){
		int start = 0, end = numbers.length-1;

		while(start <= end) {
			int mid = (start + end) / 2;
			
			//comparisons
			if(numbers[mid] == key){		//key found
				return mid;
			}
			if(numbers[mid] < key){		//right half
				start = mid+1;
			}else{					//left half
				end = mid - 1;
			}
		}
		return -1;		//key not found
	}

	public static void main(String args[]){
		int numbers[]={2,4,6,8,10,12};
		int key=10;
		
		System.out.println("Index for key is: "+ binarySearch(numbers , key));
	}
}