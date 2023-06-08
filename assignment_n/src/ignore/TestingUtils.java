package ignore;

import assignment_n.App;

public class TestingUtils {
	
	public static void runTests(){
		
		int [] params1 = {2,0,7,3,1};
		int [] params2 = {1,3,4,5,2};
		
		int  [] expected = {0,0,8,5,0};
        
		for(int i=0; i < params1.length; i++){
			int result = App.sumMinus3(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object expected, Object result){
		return "PASS: sumMinus3("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: sumMinus3("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString() 
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}

}
