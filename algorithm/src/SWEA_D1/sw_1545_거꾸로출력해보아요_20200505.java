package SWEA_D1;

import java.util.Scanner;

public class sw_1545_거꾸로출력해보아요_20200505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = N; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}
