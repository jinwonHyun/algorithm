package SWEA_D1;

import java.util.Scanner;

public class sw_2058_자릿수더하기_20200504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		int sum = 0;
		while (tmp != 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		System.out.println(sum);
		sc.close();
	}
}