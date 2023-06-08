package assignment_n;


import ignore.TestingUtils;

public class App {
	
	/**
	 * Add both parameters (a & b) together and 
	 * subtract the number 3 and return the result<br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		sumMinus3(2, 5) <b>---></b> 4 <br>
		sumMinus3(2, 1)  <b>---></b> 0 <br>
		sumMinus3(0, 2) <b>---></b> -1 <br>
	 */
		public static int sumMinus3(int a, int b) {
			
			return a+b-3;
		}
		
		
		
		
		
		

//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
		
}
