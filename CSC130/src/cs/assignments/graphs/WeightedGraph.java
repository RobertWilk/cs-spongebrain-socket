package cs.assignments.graphs;

import java.util.ArrayList;


/**
 * This class is a WeightedGraph to be used in Assignment 4.
 * 
 * @author Robert Wilk
 *
 */
public class WeightedGraph {
	
	private final int VERTICIES; 
	private int edges = 0;
	private ArrayList<ArrayList<Edge>> adjacencyList;
	
	public WeightedGraph(int verticies) {
		VERTICIES = verticies;
		adjacencyList = new ArrayList<>(VERTICIES);
		for(int i = 0; i < VERTICIES; ++i)
			adjacencyList.add(new ArrayList<Edge>());
	}
	
	public void addEdge(Edge edge) {
		int one = edge.getOne();
		adjacencyList.get(one).add(edge);
		adjacencyList.get(edge.getTheOther(one)).add(edge);
		++edges;
	}
	
	public int verticies() { return VERTICIES; }
	public int edges() { return edges; }
	public ArrayList<ArrayList<Edge>> adjacencyList() { return adjacencyList; }
}
