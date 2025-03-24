package com.rays.basic;

public class AverageofConsOddEven {
	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<=5;i++) {
			
				sumEven+=(2*i);
			
				sumOdd+=i;
			
		}
		System.out.println("Average of cosecutive even number : "+sumEven/5);
		System.out.println("Average of cosecutive odd number : "+sumOdd/5);
	}
}
