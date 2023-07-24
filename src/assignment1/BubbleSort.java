package assignment1;

public class BubbleSort {
	 static void bubbleSort(int arr[], int n)
	    {
	        int i, j, temp;
	        boolean swapped;
	        for (i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (swapped == false)
	                break;
	        }
	    }
	 
	 public static void main(String[] args) {
		int[] arr1 = {1,3,6,33,54,2,4,66,7,};
		int n = arr1.length;
		bubbleSort(arr1,n);
		for(int i =0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
