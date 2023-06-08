package ignore;

import assignment_17.App;

public class TestingUtils {
	public static void runTests(){
		

		String[] params1 = { "oore", "oohioo", "ohiohio", "hiy", "h", "", "o",
				"oo", "boo", "boao", "aoaoao", "oohoi", "oanotgo"};

		String[] expected = { "reoo", "hioooo", "hihiooo", "hiy", "h", "", "o", 
				"oo", "boo", "baoo", "aaaooo", "hiooo", "antgooo" };
        
		for(int i=0; i < params1.length; i++){
			String result = App.endoo(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: endoo("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: endoo("+ params1.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}