package variousproblem;

import java.io.*;

public class Sort2 {
	public static int[] sort;
	public static int[] tmp;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		sort = new int[n];
		tmp = new int[n];
		
		for (int i = 0; i < n; i++)
			sort[i] = Integer.parseInt(br.readLine());
		
		mergeSort(sort, 0, n - 1);
		
		for (int val : sort)
			bw.write(Integer.toString(val) + "\n");
		
		bw.flush();
	}
	
	public static void mergeSort(int[] set, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(set, left, mid);
			mergeSort(set, mid + 1, right);
			merge(set, left, mid, right);
		}
	}
	
	public static void merge(int[] set, int left, int mid, int right) {
		int p = left;
		int q = mid + 1;
		
		int idx = p;
		
		while(p <= mid && q <= right) {
			if (set[p] < set[q])
				tmp[idx++] = set[p++];
			else
				tmp[idx++] = set[q++];
		}
		
		while(p <= mid)
			tmp[idx++] = set[p++];
		
		while(q <= right)
			tmp[idx++] = set[q++];
		
		for (int i = left; i <= right; i++)
			set[i] = tmp[i];
		
	}
	
}