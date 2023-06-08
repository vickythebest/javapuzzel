package assignment_14;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given 2 arrays that are the same length containing strings, compare the 1st string in one array 
	to the 1st string in the other array, the 2nd to the 2nd and so on. 
	Count the number of times that the 2 strings are non-empty and start with the same char. 
	The strings may be any length, including 0. 	
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"})  <b>---></b> 1<br>
		matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) <b>---></b> 2 <br>
		matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"}) <b>---></b> 1 <br>
	 */
	
	public static int matchingChar(String[] a, String[] b) {
		int count=0;
		
		
		for(int i=0;i<a.length;i++) {
			String a1=a[i];
			String b1=b[i];
			
			if(a1!=null && b1!=null) {
				if(a1 !="" && b1 !="" && a1.charAt(0)==b1.charAt(0)) {
					count+=1;
				}
			}
		}
		
//		for(int i=0;i<a.length;i++) {
//			char[] a1=a[i].toCharArray();
//			for(int j=i;j<b.length;j++) {
//				
//				char[] b1=b[j].toCharArray();
//				
//				if(a1.length > 0 && b1.length > 0) {
//					if(a1[0]==b1[0]) {
//						count+=1;	
//					}
////					System.out.println("a1[0] && b1[0] "+a1[0]+" , "+b1[0]);
//				}
//			}
//		}
		
		return count;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
