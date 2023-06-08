package assignment_17;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string, compute recursively a new string where all the 
		lowercase 'o' chars have been moved to the end of the string.

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		endoo("oore") <b>---></b> reoo<br>
		endoo("oohoi") <b>---></b> hiooo <br>
		endoo("oanotgo") <b>---></b> antgooo <br>
	 */
	
	public static String endoo(String str) {

		if(str.length()<=1) {
			return str;
		}

		if(str.substring(0,1).equalsIgnoreCase("o")) {
			return endoo(str.substring(1))+str.charAt(0);
		}
		
		return str.charAt(0)+endoo(str.substring(1));
		
	}



	
//	public static String endoo(String str) {
//
//		String endoo="";
//		System.out.print(" str = "+str);
//		if(str.length()<=1) {
//			return str;
//		}
//		
//		if(str.substring(0,1).equalsIgnoreCase("o")) {
//			endoo=endoo+str.substring(0,1);
//			System.out.println(" if  endoo = "+endoo);
//		}else {
//			endoo+=str;
//		}
//			
//		}
//		
//		
//		// complete the body of this method
//		return endoo(str.substring(1))+endoo;
//		
//	}
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

