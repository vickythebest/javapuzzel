package assignment_19;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
		insideBrackets("x[hello]") <b>---></b> [hello] <br>
		insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */
	
	public static String insideBrackets(String str) {
	
		if(str.charAt(0)!='[') {
			String temp=str.substring(1);
//			System.out.println("Temp 1 = "+temp);
			return insideBrackets(temp);
		}
		
		
		if(str.charAt(str.length()-1)!=']') {
			String temp=str.substring(0,str.length()-1);
//			System.out.println("Temp 2 = "+temp);
			return insideBrackets(temp);
		}
		
//		System.out.println("str = "+str);
		return str;
//		
//		if(str.substring(0,1).equalsIgnoreCase("[")) {
//			return str.charAt(0)+insideBrackets(str.substring(1));
//		}

		
//		if(str.substring(0,1).equalsIgnoreCase("]")) {
//			return str.charAt(0)+str.substring(str.indexOf("]")+1);
//		}
		
		
//		System.out.println("str = "+str);
//		return str.charAt(0)+insideBrackets(str.substring(1));
		
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

