package com.datastructures;

import java.util.Arrays;

public class Anagrams {

	public void isAnagram(String first, String second) {
		// TODO Auto-generated method stub
		 first = first.replaceAll("\\s", "");
         second = second.replaceAll("\\s", "");
		boolean status=true;
		if(first.length() != second.length()){
			status=false;
		}else{
			char[] s1Arrah=first.toCharArray();
			char[] s2Arrah=second.toLowerCase().toCharArray();
			Arrays.sort(s1Arrah);
			Arrays.sort(s2Arrah);
			status=Arrays.equals(s1Arrah, s2Arrah);
		}
		
		if(status)
		{
			System.out.println("First"+first + "and" +second +"are Anagrams");
		}else{
			System.out.println("First"+first + "and" +second +"are not Anagrams");
		}
		
	}
}
