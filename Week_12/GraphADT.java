public class GraphADT{
	int capacity;
	int numberOFVertices = 0;
	int[][] matrix;
	
	public GraphADT(int capacity){
		this.capacity = capacity;
		matrix = new int[capacity][capacity];
	}
	
	public boolean isEmpty(){
		return numberOFVertices == 0;
	}
	
	public boolean isFull(){
		return numberOFVertices == capacity;
	}
	
	public void insertVertices(){
		if(isFull()){
			System.out.println("Graph is full");
			return;
		}
		numberOFVertices++;
	}
	
	public void insertEdges(int source , int destination , int weight){
		if(source >= 0 && source < numberOFVertices && destination >= 0 && destination < numberOFVertices ){
			matrix[source][destination] = weight;
			//for undirected graph
			//matrix[destination][source] = weight;
		}
		else{
			System.out.println("Invalid vertices");
		}
	}
	
	public void deleteVertice(int vertex){
		if(vertex >=0 && vertex< numberOFVertices){
			for (int i =0; i<numberOFVertices ; i++){
				matrix[i][vertex] = 0;
				matrix[vertex][i] = 0;
			}
			numberOFVertices--;
		}
		else{
			System.out.println("invalid vertex");
		}
		
	}
	
	public void deleteEdge(int source , int destination){
		if(source >= 0 && source < numberOFVertices && destination >= 0 && destination < numberOFVertices){
			matrix[source][destination] = 0;
			matrix[destination][source] = 0;
		}
		else{
			System.out.println("Invalid vertices");
		}
		
	}
	
	public boolean isEdge(int source , int destination){
		if(source >= 0 && source < numberOFVertices && destination >= 0 && destination < numberOFVertices){
			return matrix[source][destination] != 0;
		}
		return false;
	}
	
	public void traverseGraph(){
		for(int i =0 ; i<numberOFVertices ; i++){
			System.out.print(i + " connected to : ");
			for(int j=0 ; j<numberOFVertices; j++){
				if(matrix[i][j] != 0){
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		GraphADT graph = new GraphADT(4);
		
		graph.insertVertices();
		graph.insertVertices();
		graph.insertVertices();
		graph.traverseGraph();
		
	}
}
