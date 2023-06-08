package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		System.out.print(allDollar("hello"));
//		allDollar("hello");
	}

	public static String allDollar(String str) {
		
//		System.out.println(str);
		if(str.length()<=1) {
			return str;
		}
		
//		System.out.print(str.charAt(0)+"$");
		return str.charAt(0)+"$"+allDollar(str.substring(1));
	}
}
