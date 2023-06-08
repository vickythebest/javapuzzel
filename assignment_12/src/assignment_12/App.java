package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
		
//		System.out.println("Str = "+str);
	
		String result="";
		int length=str.length();
		
		for(int i=0;i<length;i++) {
			if(i==0 && str.charAt(i)!='*') {
				result+=str.charAt(i);
//				System.out.println(" result "+i+" "+  result);
			}
			
			
			if(i>0 && str.charAt(i)!='*' && str.charAt(i-1)!='*') {
				
				result+=str.charAt(i);
//				System.out.println(" result "+i+" "+  result);
			}
			
			
			if(i>0 && str.charAt(i-1)!='*' && str.charAt(i)=='*') {
				
				result=result.substring(0,result.length()-1);
//				System.out.println(" result "+i+" "+  result);
			}
			
			
		}
		
		return result;
	}


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
