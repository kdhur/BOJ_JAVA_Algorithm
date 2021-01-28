package variousproblem;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K_th_11004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		String line2 = br.readLine();
		st = new StringTokenizer(line2, " ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		bw.write(Integer.toString(arr[k - 1]));
		
		bw.flush();
	}

}
