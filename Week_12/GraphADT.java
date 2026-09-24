public class GraphADT{
	int capacity;
	int numberOFVertices = 0;
	int[][] matrix;
	
	public GraphADT(int capacity){
		matrix = new int[capacity][capacity];
	}
	
	public boolean isEmpty(){
		return numberOFVertices ==0;
	}
	
	public boolean isFull(){
		return numberOFVertices == capacity;
	}
	
	public void insertVertices(){
		if(isFull()){
			System.out.println("Graph is full");
		}
		numberOfVertices++;
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
		if(vertex >=0 && vertex< numberOfVertices){
			for (int i =0; i<numberOfVertices ; i++){
				matrix[i][vertex] = 0;
				matrix[vertex][i] = 0;
			}
		}
		else{
			System.out.println("invalid vertex");
		}
		
	}
	
	public void deleteEdge(int source , int destination){
		if(source >= 0 && source < numberOFVertices && destination >= 0 && destination < numberOFVertices){
			matrix[source][destination] = 0;
			matirx[destination][source] = 0;
		}
		else{
			System.out.println("Invalid vertices");
		}
		
	}
	
	public boolean isEdge(int source , int destination){
		return matrix[source][destination] != 0;
	}
	
	public void traverceGraph(){
		for(int i =0 ; i<numberOfVertices ; i++){
			System.out.print(i + "connected to : ")
			for(int j=0 ; j<numberOfVertices; j++){
				if(matrix[i][j] != 0){
					System.out.print(j + " " );
				}
			}
			System.out.print();
		}
	}
	
	
	
	public static void main (String [] args){
		GraphADT graph = new GraphADT(4);
		
		graph.insertVertices();
		graph.insertVertices();
		graph.insertVertices();
		graph.print();
		
	}
}