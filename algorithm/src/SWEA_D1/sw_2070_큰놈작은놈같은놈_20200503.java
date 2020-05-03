package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sw_2070_큰놈작은놈같은놈_20200503 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static int T, a, b;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			for (int tc = 1; tc <= T; tc++) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());

				if (a < b) {
					bw.write("#" + tc + " <\n");
				} else if (a == b) {
					bw.write("#" + tc + " =\n");
				} else {
					bw.write("#" + tc + " >\n");
				}

			} // end tc
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
