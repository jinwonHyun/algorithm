package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sw_1989_초심자의회문검사_20200516 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int T;
	static char[] arr;
	static boolean FLAG;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			for (int tc = 1; tc <= T; tc++) {
				FLAG = false;
				arr = br.readLine().trim().toCharArray();

				for (int i = 0; i < arr.length / 2; i++) {
					if (arr[i] != arr[arr.length - 1 - i]) {
						FLAG = true;
						break;
					}
				}

				if (!FLAG) {
					System.out.println("#" + tc + " 1");
				} else {
					System.out.println("#" + tc + " 0");
				}
			} // end for

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
