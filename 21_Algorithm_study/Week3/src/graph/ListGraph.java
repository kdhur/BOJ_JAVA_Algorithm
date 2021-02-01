package graph;

import java.util.ArrayList;

public class ListGraph { //그래프 생성 = 생성자
	private ArrayList<ArrayList<Integer>> listGraph; //그래프 초기화
	
	public ListGraph(int initSize) {
		this.listGraph = new ArrayList<ArrayList<Integer>>(); //정점들의 리스트 생성
		
		for (int i = 0; i < initSize + 1; i++) //1부터 시작
			listGraph.add(new ArrayList<Integer>()); //각 정점에 대한 리스트 생성 = 그래프
	}
	
	public ArrayList<ArrayList<Integer>> getGraph() { //그래프 리턴
		return this.listGraph;
	}
	
	public ArrayList<Integer> getNode(int i) { //정점 i와 연결된 정점 리턴
		return this.listGraph.get(i);
	}
	
	public void put(int x, int y) { //정점 x와 y 양방향으로 연결
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	public void putSingle(int x, int y) { //정점 x에서 y로 연결
		listGraph.get(x).add(y);
	}
	
	public void printGraph() {
		for (int i = 1; i < listGraph.size(); i++) {
			System.out.print("정점" + i + "의 인접리스트");
			
			for (int j = 0; j < listGraph.get(i).size(); j++)
				System.out.print(" -> " + listGraph.get(i).get(j));
			
			System.out.println();
		}
	}
}
