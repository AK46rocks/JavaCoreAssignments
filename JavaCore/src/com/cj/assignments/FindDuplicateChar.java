package com.cj.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a String: ");
	     String str= sc.nextLine();
		 findDuplicateCharactersInString(str);
	}
	
	static void findDuplicateCharactersInString(String str){
		HashMap<Character, Integer> h = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(!h.containsKey(str.charAt(i))) {
			   	h.put(str.charAt(i), 1);
			}else {
				h.put(str.charAt(i), h.get(str.charAt(i)) + 1);
			}
		}
		
		for(Map.Entry<Character,Integer> mapElement : h.entrySet()) {
			if(mapElement.getValue() > 1)
			System.out.println(mapElement.getKey()+" : "+mapElement.getValue());
		}
		
	}
}
