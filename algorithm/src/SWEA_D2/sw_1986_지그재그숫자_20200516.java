package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sw_1986_지그재그숫자_20200516 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int T, N, sum;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			for (int tc = 1; tc <= T; tc++) {
				N = Integer.parseInt(br.readLine().trim());
				sum = 0;
				for (int i = 1; i <= N; i++) {
					if (i % 2 != 0) {
						sum += i;
					} else {
						sum -= i;
					}
				}
				System.out.println("#" + tc + " " + sum);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}