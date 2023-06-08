package assignment_18;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string, compute recursively a new string where identical chars 
	that are adjacent in the original string are separated from each other by a "-".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatHyphen("hello") <b>---></b> hel-lo<br>
		repeatHyphen("xxyy") <b>---></b> x-xy-y <br>
		repeatHyphen("aaaa") <b>---></b> a-a-a-a <br>
	 */
	
	public static String hyphenSplit(String str) {

		if(str.length()<=1) {
			return str;
		}
		
		if(str.substring(0, 1).equalsIgnoreCase(str.substring(1, 2))) {
			return str.charAt(0)+"-"+hyphenSplit(str.substring(1));
		}
		return str.charAt(0)+hyphenSplit(str.substring(1));
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

