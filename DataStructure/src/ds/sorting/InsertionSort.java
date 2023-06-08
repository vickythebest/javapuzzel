package ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		insertionSort(new int[] {4,7,3,2,5,1});
	}
	
	public static int[] insertionSort1(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			int j=i-1;
//			System.out.println("  j >= 0 : "+j+" && arr[j] > element "+arr[j]+" > "+ element+" ");
			while(j>=0 && arr[j] > element) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				j--;
			}
			element=j+1;
		}
		printArr(arr);
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		
		int index=1;
		int i=0;
		while(index<arr.length) {
			
			System.out.println(" i : "+i+" index = "+index+" index val = "+arr[index]);
			System.out.println();
			if(arr[i]>arr[index]) {
				System.out.println(" Shift "+arr[index]+" --> "+arr[i]);
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				if(i!=0) {
					i--;
				}else {
					index++;
				}
				index--;
				printArr(arr);
				System.out.println();
			}else {
				System.out.println(" Not Shift "+arr[index]+" --> "+arr[i]);
				i++;
				index++;
			}
		}
		return arr;
	}
	
	public static void printArr(int arr[]) {
		System.out.print(" Result : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
