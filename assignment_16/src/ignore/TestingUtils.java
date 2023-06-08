package ignore;

import assignment_16.App;

public class TestingUtils {
	public static void runTests(){
		

		String[] params1 = { "xxyoxx", "yyoxyoy", "yo", "yoyoy", "y", "", "oyoyoyoyoy",
				"oyoyoyoyoyo", "yoAAyo12yo", "xyoxhxiyohhyoh", "yogurt"};

		int[] expected = { 1, 2, 1, 2, 0, 0, 4, 5, 3, 3, 1 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.yoYo(params1[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: yoYo("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: yoYo("+ params1.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}