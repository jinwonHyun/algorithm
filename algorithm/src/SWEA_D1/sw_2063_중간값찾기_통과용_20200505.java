package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class sw_2063_중간값찾기_통과용_20200505 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[T];
		int i = 0;
		while (sc.hasNextInt()) {
			arr[i++] = sc.nextInt();
			if (i == T) {
				sc.close();
				break;
			}
		}

		Arrays.sort(arr);
		System.out.println(arr[(T / 2)]);

	}
}
