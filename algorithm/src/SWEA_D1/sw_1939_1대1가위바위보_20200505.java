package SWEA_D1;

import java.util.Scanner;

public class sw_1939_1대1가위바위보_20200505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		// 보 3 바위 2 가위 1
		if (a > b) {
			if (a - b == 1) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else { // b > a
			if (b - a == 1) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}
	}
}
