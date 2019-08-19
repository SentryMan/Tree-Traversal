
class Node { 
    int data; 
    Node left, right;
   
    Node(int item){ 
        data = item; 
        left = right = null; 
    }
	
}


public class TraverseTree {
	
	
	static void inOrder(Node node){ 
        if (node != null){
        	
        
        	inOrder(node.left);
        	System.out.print(node.data + " "); 
        	inOrder(node.right);
        } 
    } 
	
	static void preOrder(Node node) {
		if (node != null) {
    	
    
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
}
	
	static void postOrder(Node node) {
	    if (node != null) {
	        postOrder(node.left);
	        postOrder(node.right);
	        System.out.print(node.data + " ");
	    }
	}
	
	
	public static void main(String[] args){
		
		Node tree = new Node(2);
	
	    tree.left = new Node(7); //this puts 7 in the left node
	    tree.left.left = new Node(2); // this puts 2 in the left node of the left node
	    tree.left.right = new Node(6);// and so on
	    tree.left.right.left = new Node(5);
	    tree.left.right.right = new Node(11);

	    tree.right = new Node(5);// right side
	    tree.right.right = new Node(9); 
	    tree.right.right.left = new Node(4);  
	    
	    System.out.println("Inorder: ");
	    inOrder(tree);
	    System.out.println("\n\nPreorder: ");
	    preOrder(tree);
	    System.out.println("\n\nPost Order: ");
	    postOrder(tree);
	    
	}

}
