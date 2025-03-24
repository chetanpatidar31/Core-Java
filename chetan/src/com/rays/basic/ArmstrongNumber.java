package com.rays.basic;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// testing arm() method
		ArmstrongNumber ar = new ArmstrongNumber();
		System.out.println("------No Parameter-------");
		ar.arm();
//		System.out.println("------Sigle Parameter-------");
//		ar.arm(1634);

	}

	public void arm(int num) {
		int n = 0;
		int rem;
		int result = 0;
		// number of digit
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;

			n++;
		}
		// check armstrong
		temp = num;
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
		if (num == result) {
			System.out.println(num + " is Armstrong");
		} else {
			System.out.println(num + " is not Armstrong");
		}

	}

	public void arm() {
		int a = 1634;
		int temp = a;
		int r = 0;
		int sum = 0;

		while (temp > 0) {
			r = temp % 10;
			sum = sum + r * r * r * r;
			temp = temp / 10;
			System.out.println("inside while loop sum value " + sum);
		}
		System.out.println("Sum value : " + sum);
		if (a == sum) {
			System.out.println(a + " is armstrong");
		} else {
			System.out.println(a + " is not armstrong");
		}
	}

}
