package SWEA_D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sw_2050_알파벳을숫자로변환_20200504 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) {
		char[] charr = new char[27];
		try {
			charr = br.readLine().trim().toCharArray();
			for (int i = 0; i < charr.length; i++) {
				bw.write(charr[i] - 64 + " ");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
