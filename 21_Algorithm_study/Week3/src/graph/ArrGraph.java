package graph;

public class ArrGraph {
	private int[][] arrGraph;

	public ArrGraph(int initSize) { // 생성자
		this.arrGraph = new int[initSize + 1][initSize + 1]; // 1부터 시작
	}

	public int[][] getGraph() { // 그래프 리턴
		return this.arrGraph;
	}

	public void put(int x, int y) { // 정점 x와 y 양방향 연결
		arrGraph[x][y] = arrGraph[y][x] = 1;
	}

	public void putSingle(int x, int y) { // 정점 x에서 y로 연결
		arrGraph[x][y] = 1;
	}

	public void printGraph() {
		for (int i = 0; i < arrGraph.length; i++) {
			for (int j = 0; j < arrGraph.length; j++)
				System.out.print(" " + arrGraph[i][j]);

			System.out.println();
		}
	}
}
