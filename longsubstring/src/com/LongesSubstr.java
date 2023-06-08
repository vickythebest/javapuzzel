package com;

import java.util.HashSet;
import java.util.Set;

public class LongesSubstr {

	public static void main(String[] args) {
		
		System.out.println(longstr("pwwkew"));

	}
	
	
	public static int longstr(String s) {
		
		int n = s.length();
	    if (n == 0) {
	        return 0;
	    }
	    
	    int maxLen = 1;
	    Set<Character> window = new HashSet<>();
	    int left = 0;
	    int right = 1;
	    window.add(s.charAt(0));
	    
	    while (right < n) {
	        if (!window.contains(s.charAt(right))) {
	            window.add(s.charAt(right));
	            right++;
	            maxLen = Math.max(maxLen, right - left);
	        } else {
	            window.remove(s.charAt(left));
	            left++;
	        }
	    }
	    
	    return maxLen;
	}
}
