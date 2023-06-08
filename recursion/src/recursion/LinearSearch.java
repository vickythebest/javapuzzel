package recursion;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[]= {5,32,6,8,1};
		System.out.println("Result : "+findIndex(arr, 0, 1));
	}
	
	public static void reduceByOne(int n) {
		if(n>0) {
			reduceByOne(n-1);
		}
		System.out.println("Reduce "+n);
	}
	public static int findIndex(int[] list,int index,int key) {
//		System.out.println("find "+key+" index "+index+" elements :"+list[index]);
		if(index >list.length-1) {
//			System.out.println("Not found");
			return -1;
		}else if(list[index]==key) {
			System.out.println("Match at index "+index);
			return index; 
		}else {
//			System.out.println("not match "+list[index]);
			return findIndex(list,index+1,key);
		}
//	return -1; 
	}

}
