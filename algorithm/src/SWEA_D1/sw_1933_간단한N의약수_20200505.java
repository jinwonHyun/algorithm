package SWEA_D1;

import java.util.Scanner;

public class sw_1933_간단한N의약수_20200505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
