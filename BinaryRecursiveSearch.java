public class BinaryRecursiveSearch implements Practice03Search{
	
	//public BinaryRecursiveSearch();
	public int search(int [] arr, int target){
		return search(arr,target,0,arr.length-1);
	}
	public int search(int[] arr, int target, int low, int high){
		int mid = (low+high)/2;
		if(low>high){					//base case if low is greater than high, the target was not found, returns -1
			return -1;
		}else if(arr[mid] == target){	//checks if midpoint was the target
			return mid;
		}else if(arr[mid] > target){		//adjusts the high point to equal the midpoint
			return search(arr,target,low,mid-1);
		}else{								//adjusts the low point to equal the midpoint
			return search(arr,target,mid+1,high);
		}
	}

	public String searchName(){
		return "Binary Recursive Search";
	}
}