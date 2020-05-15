package SWEA_D1;

import java.util.Scanner;

public class sw_2019_더블더블_20200505 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		sc.close();
		for (int i = 0; i <= T; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
	}
}
