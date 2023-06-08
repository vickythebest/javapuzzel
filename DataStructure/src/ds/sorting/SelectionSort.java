package ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
//		selectionSort(new int[]{5,0,6,3,1,7});
		selectionSort1(new int[]{5,0,6,3,1,7});
	}

	public static int[] selectionSort1(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int newmin=i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[newmin]>arr[j]) {
					newmin=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[newmin];
			arr[newmin]=temp;
		}
		printArr(arr);
		return arr;
	}
	public static int[] selectionSort(int arr[]) {
		System.out.print("Before ");
		printArr(arr);
		System.out.println();
		int newmin=arr[0];
		int minindex=0;
		int index=0;
		int i=1;
		while(i<=arr.length-1) {
			
			if(arr[i]<newmin) {
				newmin=arr[i];
				minindex=i;
			}
			
			if(i==arr.length-1) {
				int temp=arr[minindex];
				arr[minindex]=arr[index];
				arr[index]=temp;
				index++;
				newmin=arr[index];
				i=index;
			}

//			System.out.println("newmin :"+newmin);
//			System.out.println("Now preindex is "+minindex+" : "+arr[minindex]);
//			System.out.println("After Swap new elements at ["+i+"] "+arr[i]);
			
			i++;
		}
		System.out.print("After ");
		printArr(arr);
		return arr;
	}
	
	public static void printArr(int arr[]) {
		System.out.print(" Result : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
