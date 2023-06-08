package assignment_08;

import ignore.TestingUtils;

public class App {


	/**

	Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments 
	is the same as any of the other ones, that number should not count towards the sum. 
	So basically you only sum unique numbers, not duplicates
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		sumUnique(1, 2, 3)   <b>---></b> 6 <br>
		sumUnique(3, 2, 3)    <b>---></b> 2 <br>
		sumUnique(3, 3, 3) <b>---></b> 0 <br>
	 */
	
	public static int sumUnique(int a, int b, int c) {
		
		if(a!=b && a!=c && b!=c) {
			return a+b+c;
		}else if(a!=b && a==c) {
			return b;
		}else if(a==b && b!=c) {
			return c;
		}else if(a!=b && b==c) {
			return a;
		}
		
		return 0;
		
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
