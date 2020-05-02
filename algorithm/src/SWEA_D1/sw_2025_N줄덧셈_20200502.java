package SWEA_D1;

import java.util.Scanner;

public class sw_2025_N줄덧셈_20200502 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		i = sc.nextInt();
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println(sum);
	}
}
