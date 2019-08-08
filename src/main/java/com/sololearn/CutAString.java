package com.sololearn;

import java.util.ArrayList;
import java.util.List;

public class CutAString {

	String a = "111222334555";
	String b = "aaabbbccddefff";
	String c = "xxx8888yy9999zzzz0";
	String d = "1112221111222";
	String e = "aaBbAaaacCCc";
	
	public static void main(String[] args) {

		new CutAString();
	}
	
	public CutAString() {
//		split(a);
//		System.out.println(split(""));
	}

//	String[] 
	List<String>
			split(String input) {

		if (input.isEmpty()){
			return null;
		}
//		String[] split = new String[a.length()];
		List<String> split = new ArrayList<String>();
		char z[] = input.toCharArray();
		StringBuffer tmp = new StringBuffer();
//		int j=0;
		
		for (int i=0; i<z.length-1; i++){
			if (z[i] == z[i+1]) {
				tmp.append(z[i]);
			}
			else if (z[i] != z[i+1]) {
//				tmp.append(z[i]);
				split.add(tmp.append(z[i]).toString());
				tmp = new StringBuffer();
			}
		}
//		tmp.append(z[z.length-1]);
		split.add(tmp.append(z[z.length-1]).toString());
		
//		System.out.println(split.toString());
		
		return split;
	}
}