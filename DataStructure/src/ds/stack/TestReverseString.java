package ds.stack;

public class TestReverseString {

	public static void main(String[] args) {

		ReverseString reverseString=new ReverseString(5);
		
		
		
		System.out.println(reverseString("HELLO"));
//		reverseString.push("H");
//		reverseString.push("E");
//		reverseString.push("L");
//		reverseString.push("L");
//		reverseString.push("O");
		
//		while(!reverseString.isEmpty()) {
//			System.out.println(reverseString.pop());	
//		}
	}
	
	public static String reverseString(String str) {
		
		int strLength=str.length();
		ReverseString strRev=new ReverseString(strLength);
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			strRev.push(c);
		}
		
		String result = "";
		while(!strRev.isEmpty()) {
			result=result+strRev.pop();
		}

		return result;
		
	}
	

}
