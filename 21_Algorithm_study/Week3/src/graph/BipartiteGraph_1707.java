package graph;

import java.util.*;

public class BipartiteGraph_1707 {
	static boolean exit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();	
			for (int j = 0; j < v + 1; j++) //1부터 시작
				graph.add(new ArrayList<Integer>());
			for (int j = 0; j < e; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				graph.get(x).add(y);
				graph.get(y).add(x);	
			}
			
			exit = false;
			boolean[] c = new boolean[graph.size()]; //방문여부
			for (int j = 1; j < c.length; j++)
				if (!c[j])
					bfs(graph, j, c);		
			
			if(exit)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

	static void bfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] c) {
		Queue<Integer> q = new LinkedList<>();
		int[] b = new int[graph.size()]; //2가지 색으로 색칠

		q.add(v);
		c[v] = true;
		b[v] = 1;

		while (!q.isEmpty()) {
			v = q.poll();

			for (Iterator<Integer> iter= graph.get(v).iterator(); iter.hasNext();) {
				int tmp = (int) iter.next();
				if(!c[tmp]) {
					q.add(tmp);
					c[tmp] = true;
					if(b[v] == 1)
						b[tmp] = 2;
					else if (b[v] == 2)
						b[tmp] = 1;
				}
				else
					if(b[tmp] == b[v]) {
						exit = true;
						return;
					}
				
			}
		}
	}
}
