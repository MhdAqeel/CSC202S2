public class Node{
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinarySearchTreeADT{
	Node root;
	
	public BinarySearchTreeADT(){
		root = null;
	}
	
	public boolean isEmpty() {
        return root == null;
    }
	
	public Node insert(Node currentNode, int data){
		if(currentNode == null){
			currentNode = new Node(data);
			return currentNode;
		}
		
		if(data < currentNode.data){
			currentNode.left = insert(currentNode.left , data); 
		}
		else if(data> currentNode.data){
			currentNode.right = insert(currentNode.right , data);
		}
		
		return currentNode;
	}
	
	// Public API method
    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    // Recursive helper method
    private void inOrderTraversal(Node currentNode) {
        if (currentNode != null) {
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.data + " ");
            inOrderTraversal(currentNode.right);
        }
    }
  
	public static void main (String [] args){
		BinarySearchTreeADT bst = new BinarySearchTreeADT();
		bst.root = bst.insert(bst.root , 50);
		bst.root = bst.insert(bst.root , 30);
		bst.root = bst.insert(bst.root , 70);
		bst.root = bst.insert(bst.root , 20);
		bst.root = bst.insert(bst.root , 40);
		bst.root = bst.insert(bst.root , 60);
		bst.root = bst.insert(bst.root , 80);
		
		bst.inOrderTraversal();
	}
}