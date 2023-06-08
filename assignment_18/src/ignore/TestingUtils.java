package ignore;

import assignment_18.App;

public class TestingUtils {
	public static void runTests(){
		

		String[] params1 = { "hello", "xxyy", "aaaa", "aaab", "aa", "a", "",
				"noadjacent", "abba", "abbba"};

		String[] expected = { "hel-lo", "x-xy-y", "a-a-a-a", "a-a-ab", "a-a", "a", "", 
				"noadjacent", "ab-ba", "ab-b-ba"};
        
		for(int i=0; i < params1.length; i++){
			String result = App.hyphenSplit(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: hyphenSplit("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: hyphenSplit("+ params1.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}