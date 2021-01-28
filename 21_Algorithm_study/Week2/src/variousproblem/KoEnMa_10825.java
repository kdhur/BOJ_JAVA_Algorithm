package variousproblem;

import java.io.*;
import java.util.*;

public class KoEnMa_10825 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][4];
		for (int i = 0; i < n; i++)
			arr[i] = br.readLine().split(" ");

		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
					if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
						if (Integer.parseInt(o1[3]) == Integer.parseInt(o1[3]))
							return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); // 이름을 사전순으로-> 구조체로 다시
						else
							return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]); //수학 점수가 감소
					} else
						return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]); //영어 점수가 증가
				} else
					return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]); // 국어 점수가 감소
			}
		});

		for (int i = 0; i < n; i++)
			bw.write(arr[i][0] + "\n");

		bw.flush();
	}

}
