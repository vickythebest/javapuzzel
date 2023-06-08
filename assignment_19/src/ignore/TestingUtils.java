package ignore;

import assignment_19.App;

public class TestingUtils {
	public static void runTests(){
		

		String[] params1 = { "xyz[abc]123", "x[hello]", "[xy]1", "not really [possible]", "[abc]", "[abc]xyz", "[abc]x",
				"[x]", "[]", "res [ipsa] loquitor", "hello[not really]there", "ab[ab]ab"};

		String[] expected = { "[abc]", "[hello]", "[xy]", "[possible]", "[abc]", "[abc]", "[abc]", 
				"[x]", "[]", "[ipsa]", "[not really]", "[ab]"};

        
		for(int i=0; i < params1.length; i++){
			String result = App.insideBrackets(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: insideBrackets("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: insideBrackets("+ params1.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}