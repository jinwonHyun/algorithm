package SWEA_D1;

import java.util.Scanner;

public class sw_1938_아주간단한계산기_20200502 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = sc.nextInt();
		int b = sc.nextInt();
		// + , - , * , / 순
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(Math.floorDiv(a, b));
	}
}
