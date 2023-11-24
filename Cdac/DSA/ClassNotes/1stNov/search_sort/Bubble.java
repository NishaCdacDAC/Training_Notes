class Bubble {
	public static void sort(int arr[]) {

		for(int i = 0 ; i < arr.length - 1 ; i++) {
	
			int flag = 0;	
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				
				if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				flag = 1;				 
			      }	
			}

			if(flag == 0)
			break;
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,40,20,50,30};
		sort(arr);
		System.out.println("All elements in arr are : ");
		for(int i : arr)
		  System.out.print(i+" ");				
	}
}