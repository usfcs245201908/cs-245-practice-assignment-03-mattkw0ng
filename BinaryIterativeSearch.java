public class BinaryIterativeSearch implements Practice03Search{
	
	//public BinaryIterativeSearch();
	public int search(int [] arr, int target){
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		while(low<=high){		//stays in while loop until low is greater than or equal to high
			int mid = (low+high)/2; 
			if(low>high){		//pseudo base case that returns -1 if the target is not found at the end of the while loop
				index = -1;
				break;
			}else if(arr[mid] == target){	//checks if the mid point is the target
				index = mid;
				break;
			}else if(arr[mid] > target){	//if the mid point is too high it adjusts the high point to equal the midpoint
				high = mid-1;
			}else{							//if the mid point is too low it will adjust the low point to equal the midpoint
I				low = mid+1;
			}	
		}

		return index;

	}

	public String searchName(){
		return "Binary Iterative Search";
	}
}