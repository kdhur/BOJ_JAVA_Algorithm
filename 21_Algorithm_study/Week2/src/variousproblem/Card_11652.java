package variousproblem;

import java.util.*;

public class Card_11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		int[] cnt = new int[n];
		int[] idx = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			cnt[i] = 1;
		}

		Arrays.sort(arr);
		int j = 0;

		for (int i = 0; i + 1 < n; i++) { // 카드 당 개수 세기
			if (arr[i] == arr[i + 1]) {
				cnt[j]++;
			}
			else
				j++;
		}

		int max = 0;

		for (int i = 0; i < cnt.length; i++) { // 가장 많은 카드 찾기
			max = Math.max(max, cnt[i]);
		}

		for (int i = 0; i < cnt.length; i++) { // 가장 많은 카드의 인덱스 찾기
			if (cnt[i] == max) {
				idx[i] = i;
			}
		}

		long min = Integer.MAX_VALUE;
		for (int i = 0; i < idx.length; i++) { // 가장 많은 카드가 여러 개일 때 작은 것 찾기
			min = Math.min(min, arr[idx[i]]);
		}

		System.out.println(min);

	}

}
