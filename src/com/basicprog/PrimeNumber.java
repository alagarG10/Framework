package com.basicprog;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 11;
		int count = 0;
		
		if (a<=1) {
			System.out.println("The Number Is Not Prime");
			return;
		}
		
		for (int i = 1; i <= a/2; i++) {
			if (a%i==0) {
				count++;
			}
		}
		
		if (count>1) {
			System.out.println("The Number Is Not Prime");
		}
		else {
			System.out.println("The Number Is Prime");
		}
		
	}

}
