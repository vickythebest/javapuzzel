package algo.binarysearch;

public class TestBinarySearhRecursive {

	public static void main(String[] args) {

		int list[]= {1,2,3,4,5,6,7,8,9,10};
		BinarySearchRecursive search=new BinarySearchRecursive();
		int key=10;
		System.out.println("Index position of "+key+" is : "+search.findIndex(list,0,(list.length),key));
	}
}
