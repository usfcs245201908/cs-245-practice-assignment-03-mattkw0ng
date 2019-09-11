public class LinearSearch implements Practice03Search{
	
	//public LinearSearch();
	public int search(int [] arr, int target){
		for(int i = 0 ; i < arr.length ; i++){		//iterates through the array to check if the number is the target 
			if(arr[i] == target){
				return i;
			}
		}

		return -1;
	}

	public String searchName(){
		return "Linear Search";
	}
}