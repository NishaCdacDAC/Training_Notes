class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int smallest = i;

			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[smallest])
					smallest = j;
			}

			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,50,12,18,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
