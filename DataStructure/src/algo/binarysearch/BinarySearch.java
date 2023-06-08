package algo.binarysearch;

public class BinarySearch {

	public int findIndex(int[] list,int key) {
		
		int q=0;
		int p=0;
		int r=list.length-1;
		int count=0;
		
		while(p<=r) {
			q=(p+r)/2;
			System.out.println("q : "+q+" r :"+r+" p : "+p);
			
			if(list[q]==key) {
				return q; 
			}
			
			if(list[q]>key) {
				r=(q-1);
			}
			
			if(list[q]<key) {
				p=(q+1);
			}
			
			count++;
//			System.out.println("Total Attempt = "+count);	
		}
		
		return -1;
		
	}
}
