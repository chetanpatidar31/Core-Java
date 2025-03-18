package com.rays.basic;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//testing method
		ArmstrongNumber ar = new ArmstrongNumber();
		ar.arm();
		System.out.println("-------------");
		
		
		int arm = 8208;
		int n = 0;
		int rem;
		int result = 0;
		// number of digit
		int temp = arm;
		while (temp != 0) {
			temp = temp / 10;

			n++;
		}
		// check armstrong
		temp = arm;
		while (temp != 0) {
			rem = temp % 10;
			int p = 1;
			for (int i = 0; i < n; i++) {
				p = p * rem;
			}
			System.out.println("r1 : " + result);
			result = result + p;
			temp = temp / 10;

		}
		System.out.println("r2 : " + result);
		if (arm == result) {
			System.out.println(arm + " is Armstrong");
		} else {
			System.out.println(arm + " is not Armstrong");
		}
	}

	public void arm() {
		System.out.println("Arm Method Start");
		int a = 153;
		int temp = a;
		int r = 0;
		int sum = 0;

		while (temp > 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		System.out.println("Sum value : " + sum);
		if (a == sum) {
			System.out.println(a+" is armstrong");
		} else {
			System.out.println(a+" is not armstrong");
		}
		System.out.println("Arm Method end");
	}

}
