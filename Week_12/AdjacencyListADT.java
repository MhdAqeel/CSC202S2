class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class AdjacencyListADT{
	Node [] matrix;
	int maxVetices;
	int numVertices;
	
	public AdjacencyListADT(int maxVetices){
		this.maxVetices = maxVetices;
		this.numVertices = 0;
		matrix = new Node[maxVetices];
	}
	
	public boolean isEmpty(){
		return numVertices ==0;
	}
	
	public boolean isFull(){
		return numVertices == maxVetices;
	}
	
	public void insertVertices(){
		if(isFull()){
			System.out.println("Graph is full");
			return;
		}
		numVertices++;
	}
	
	public void insertEdges(int source , int destination){
		if(source >= 0 && source < numVertices && destination >= 0 && destination < numVertices ){
			Node newNode = new Node(destination);
			newNode.next = matrix[source];
			matrix[source] = newNode;
			
			//for undirected 
			Node newNode2 = new Node(source);
			newNode2.next = matrix[destination];
			matrix[destination] = newNode2;
		}
		else{
			System.out.println("Invalide vertices");
		}
	}
	
	public boolean isEdge(int source, int destination){
		Node currentNode = matrix[source];
		while(currentNode != null){
			if(currentNode.data == destination){
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}
	
	public void traversal(){
		for (int i=0 ; i<numVertices; i++){
			Node currentNode = matrix[i];
			System.out.print(i + " connected to : ");
			while(currentNode != null){
				System.out.print(currentNode.data + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		AdjacencyListADT g1 = new AdjacencyListADT(4);
		System.out.println("Is this graph empty ? : " + g1.isEmpty());
		g1.
		
	}
}