package com.basicprog;

public class VovelsRemove {
	public static void main(String[] args) {
		String s = "ALAGAR";
		String result = s.replaceAll("[AEIOU]","");
		System.out.println(result);
	}

}
