package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW_2068_최대수구하기_20200503 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;

	public static void main(String[] args) {
		try {
			int T = Integer.parseInt(br.readLine().trim());

			for (int tc = 1; tc <= T; tc++) {
				int max = 0;
				int tmp = 0;
				st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					tmp = Integer.parseInt(st.nextToken());
					if (max < tmp) {
						max = tmp;
					}
				}
				bw.write("#" + tc + " " + max + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
