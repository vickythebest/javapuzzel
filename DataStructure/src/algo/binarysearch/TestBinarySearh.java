package algo.binarysearch;

public class TestBinarySearh {

	public static void main(String[] args) {

		int list[]= {1,2,3,4,5,6,7,8,9,10};
		
		BinarySearch search=new BinarySearch();
		int i=11;
		System.out.println("Index position of "+i+" is : "+search.findIndex(list, i));
	}
}
