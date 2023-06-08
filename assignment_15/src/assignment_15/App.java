package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		char[] str1=str.toCharArray();
		char temp=32;
		int counter=1;
		int max=0;
		for(int i=0;i<str1.length;i++) {
			if(str1[i]==temp) {
				counter+=1;
//				System.out.println("If Char = "+str1[i]+" Temp = "+temp+" counter = "+counter+" max = "+max);
			}else {
				counter=1;
//				System.out.println("Else Char = "+str1[i]+" Temp = "+temp+" counter = "+counter+" max = "+max);
				temp=str1[i];
			}
			if(max<counter) {
				max=counter;
			}
		}

		return max;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}



//char[] str1=str.toCharArray();
//
//Map<Character,Integer> hm=new HashMap<>();
//for(int i=0;i<str1.length;i++) {
//	if(hm.containsKey(str1[i])) {
//		int currentValue = hm.get(str1[i]);
//		hm.put(str1[i], currentValue +1);
//	}else {
//	int counter = hm.getOrDefault(str1[i], 0);
//	hm.put(str1[i], counter + 1);
//	}
//}
//
//int temp=0;
//for(Map.Entry<Character, Integer> c:hm.entrySet()) {
//	if(c.getValue()>temp) {
//		temp=c.getValue();
//	}
//}
//
//return temp;
