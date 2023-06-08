package algo.binarysearch;

public class BinarySearchRecursive {

	public int findIndex(int[] list,int p,int r,int key) {
		String dot=".";
		System.out.println("[ "+p+" .... "+r+" ]");

		if(p>r) {
			return -1;
		}else {
			int q=(p+r)/2;
			if(list[q] == key) {
				return q;
			}else if(list[q] > key){
				return findIndex(list, p, q-1, key);
			}else{
				p=(q+1);
				return findIndex(list, q+1, r, key);
			}
		}
	}
}
