package trees;
class Node{
	int data;
	Node left,right;
	Node(int value)
	{
		data=value;
		left=null;
		right=null;
	}
}



public class TreeTraversal {
	
	//TreeTraversal(Node root){
	//	root=null;
	//}
	
	static void PreOrder(Node root) {
		if(root==null)
			return ;
		System.out.println(root.data);
		PreOrder(root.left);
		PreOrder(root.right);
	}
	
	static void InOrder(Node root) {
		if(root==null)
			return;
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
	}
	
	static void PostOrder(Node root) {
		if(root==null)
			return;
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.println(root.data);
	}
	
	static int sum(Node root) {
		int sum=0;
		if(root==null)
			return 0;
		return root.data+sum(root.left)+sum(root.right);
	}
	
	static int size(Node root) {
		if(root==null)
			return 0;
		return 1+size(root.left)+size(root.right);
		
	}
	
	static int maxValue(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;
		int a=maxValue(root.left);
		int	b=maxValue(root.right);
		return Math.max(root.data, Math.max(a,b));
	}
	
	static int height(Node root) {
		if(root.left==null || root.right==null)
			return 0;
		int a=height(root.left);
		int b=height(root.right);
		return 1+Math.max(a, b);
		
	}
	
	static boolean isBST(Node root) {
		if(root.left==null && root.right==null)
		 return true ;
		
		if(root.left==null) {
				if(root.right.data >root.data)
					return isBST(root.right);
				else
					return false ;
		}	
		
		
		  if(root.right==null) {
				 if(root.left.data <root.data)
					 return isBST(root.left);
				 else
					 return false;
		  }
		  if(root.left.data<root.data && root.data<root.right.data) 
			  return (isBST(root.left) && isBST(root.right));
		else
			return false;
		  
	}
	static boolean isBSTEfficientApproach(Node root){
		
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	
	public static boolean isBSTUtil(Node root, int minValue, int maxValue) {
		if(root==null)
			return true;
		if(root.data<minValue || root.data > maxValue)
			return false;
		return isBSTUtil(root.left,minValue,root.data-1) && isBSTUtil(root.right,root.data+1,maxValue);
	}

	public static void main(String[] args) {
		Node root;
		root = new Node(4);
		root.left=new Node(2);
		root.right=new Node(5);
	//	root.right.right=new Node(6);
		root.left.left=new Node(1);
	//	root.left.left.left=new Node(0);
		root.left.right= new Node(3);
		
		System.out.println("The elements of preorder are: ");
		PreOrder(root);
		System.out.println("The elements of inorder are: ");
		InOrder(root);
		System.out.println("The elements of postorder are: ");
		PostOrder(root);
		System.out.println("The sum of all the elements of tree :"+sum(root));
		System.out.println("The size of tree :"+size(root));
		System.out.println("The maxvalue in the tree is :"+maxValue(root));
		System.out.println("The height of the tree is :"+height(root));
		
		System.out.println(isBST(root));
		System.out.println(isBSTEfficientApproach(root));
		
}
}