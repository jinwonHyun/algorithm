package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sw_2072_홀수만더하기_20200514 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static int T, sum, tmp;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			for (int tc = 1; tc <= T; tc++) {
				sum = 0;
				st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					tmp = Integer.parseInt(st.nextToken());
					if (tmp % 2 == 1) {
						sum += tmp;
					}
				}
				bw.write("#" + tc + " " + sum + "\n");
			}
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
