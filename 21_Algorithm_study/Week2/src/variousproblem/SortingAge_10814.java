package variousproblem;

import java.io.*;
import java.util.*;

public class SortingAge_10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		for (int i = 0; i < n; i++)
			arr[i] = br.readLine().split(" ");
		
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for (int i = 0; i < n; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		
		bw.flush();
	}

}
