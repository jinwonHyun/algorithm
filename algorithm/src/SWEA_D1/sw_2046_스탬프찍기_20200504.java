package SWEA_D1;

import java.util.Scanner;

public class sw_2046_스탬프찍기_20200504 {
	static StringBuffer sb = new StringBuffer();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int input = sc.nextInt();
		sb.setLength(0);
		for (int i = 0; i < input; i++) {
			sb.append("#");
		}
		System.out.println(sb);
	}
}
