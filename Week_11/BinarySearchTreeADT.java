class Node{
	int data;
	Node left;
	Node right;
	
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
	
	public boolean search(Node root , int data){
		if(root == null){
			return false;
		}
		
		if(data == root.data){
			return true;
		}
		else if(data<root.data){
			return search(root.left,data);
		}
		else{
			return search(root.right,data);
		}
	}
	
	public void findMinumum(Node currentNode){
		while(currentNode.left != null){
			currentNode = currentNode.left;
		}
		System.out.println("minimum is " + currentNode.data);
	}
	
	public void finMaximum(Node currentNode){
		while(currentNode.right != null){
			currentNode = currentNode.right;
		}
		System.out.println("Maximum is " + currentNode.data);
	}
	/*
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
    }*/
	
	public void inOrderTraversal(Node currentNode) {
        if (currentNode != null) {
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.data + " ");
            inOrderTraversal(currentNode.right);
        }
    }
	
	public void preOrderTraversal(Node currentNode){
		if (currentNode != null) {
            System.out.print(currentNode.data + " ");
			preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
	}
	
	public void postOrderTraversal(Node currentNode){
		if (currentNode != null) {
            postOrderTraversal(currentNode.right);
			System.out.print(currentNode.data + " ");
			postOrderTraversal(currentNode.left);    
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
		
		System.out.print("Inorder traversal : ");
		bst.inOrderTraversal(bst.root);
		System.out.println();
		
		System.out.print("Preorder traversal : ");
		bst.preOrderTraversal(bst.root);
		System.out.println();
		
		System.out.print("postorder traversal : ");
		bst.postOrderTraversal(bst.root);
		System.out.println();
		
		System.out.println("is 50 in here ? "+bst.search(bst.root,50));
		System.out.println("is 100 in here ? "+bst.search(bst.root,100));
		
		bst.findMinumum(bst.root);
		bst.finMaximum(bst.root);
	}
}