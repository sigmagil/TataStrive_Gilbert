package day2;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int reverse = 0;

		if (num > 1000 && num < 9999) {
			
			while (num != 0) {
				reverse = reverse * 10 + (num % 10);
				num /= 10;
			}
		} else {
			System.out.println("please enter a valid 4 digit number");
			return;
		}
		System.out.println(reverse);

	}
}
