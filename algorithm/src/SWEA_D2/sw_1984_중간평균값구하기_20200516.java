package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sw_1984_중간평균값구하기_20200516 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int T;
	static int[] arr;
	static float sum, tmp;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			arr = new int[10];

			for (int tc = 1; tc <= T; tc++) {

				st = new StringTokenizer(br.readLine().trim());
				int idx = 0;
				while (st.hasMoreTokens()) {
					arr[idx++] = Integer.parseInt(st.nextToken());
				}

				Arrays.sort(arr);
				sum = 0;
				for (int i = 1; i < 9; i++) {
					sum += arr[i];
				}
				tmp = sum / 8;
				System.out.println("#" + tc + " " + Math.round(tmp));
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
