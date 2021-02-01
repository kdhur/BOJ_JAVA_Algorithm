package graph;

import java.util.*;

public class PermutationCycle_10451 {
	static boolean iscycle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();		
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();	
			for (int j = 0; j < n + 1; j++) //1부터 시작
				graph.add(new ArrayList<Integer>());
			for (int j = 1; j < n + 1; j++) {
				int x = sc.nextInt();
				graph.get(j).add(x);	
			}
			
			int cycle = 0;
			boolean[] c = new boolean[n + 1]; // 방문여부
			
			for (int j = 1; j < c.length; j++) {
				iscycle = false;
				if (!c[j])
					bfs(graph, j, c);
				if(iscycle)
					cycle++;
			}			
				
			System.out.println(cycle);
		}
	}
	static void bfs(ArrayList<ArrayList<Integer>> graph, int v, boolean c[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		c[v] = true;

		while (!q.isEmpty()) {
			v = q.poll();
			int cnt = 0;

			for (Iterator<Integer> iter= graph.get(v).iterator(); iter.hasNext();) {
				int tmp = (int) iter.next();
				if(cnt > 0) {
					iscycle = false;
					return;
				}
				if(!c[tmp]) {
					q.add(tmp);
					c[tmp] = true;
					cnt++;
				}
			}

		}
		iscycle = true;
	}
}
