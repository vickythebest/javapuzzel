package recursion;

public class happy {
public static void main(String[] args) {
	String a= "abc[hello how are you]f";
	
	System.out.println(a.substring(a.indexOf("["),a.indexOf("]")+1));
	String b= "[e]f";
	System.out.println(b.substring(b.indexOf("["),b.indexOf("]")+1));
}
}
