package SWEA_D1;

import java.util.Scanner;

public class sw_2043_서랍의비밀번호_20200505 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		if (P > K) {
			System.out.println(P - K + 1);
		} else {
			System.out.println(999 - K + P + 1);
		}
	}

}
