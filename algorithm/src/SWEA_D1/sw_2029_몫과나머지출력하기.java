package SWEA_D1;

import java.util.Scanner;

public class sw_2029_몫과나머지출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 1; i <= T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("#" + i + " " + a / b + " " + a % b);
		}
		sc.close();
	}
}
