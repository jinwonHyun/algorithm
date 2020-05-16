package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sw_2056_연월일달력_20200514 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int T, MM, DD;
	static String YMD;
	static boolean FLAG;

	public static void main(String[] args) {
		try {
			T = Integer.parseInt(br.readLine().trim());
			for (int tc = 1; tc <= T; tc++) {
				FLAG = false;
				YMD = br.readLine().trim();
				MM = Integer.parseInt(YMD.substring(4, 6));
				DD = Integer.parseInt(YMD.substring(6, 8));

				if (0 >= MM || MM > 12 || 0 >= DD || DD > 31) {
					FLAG = true;
				} else {
					switch (MM) {
					case 2:
						if (DD > 28) {
							FLAG = true;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (DD > 30) {
							FLAG = true;
						}
						break;

					default:

						break;
					}
				}
				if (!FLAG) {
					System.out.println("#" + tc + " " + YMD.substring(0,4) + "/" + YMD.substring(4, 6) + "/"
							+ YMD.substring(6, 8));
				} else {
					System.out.println("#" + tc + " -1");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
