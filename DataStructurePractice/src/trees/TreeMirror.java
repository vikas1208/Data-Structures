package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
	int data;
	Node1 left,right;
	Node1(int value){
		data=value;
		left=null;
		right=null;
	}
}

public class TreeMirror {
		Node1 root;
		
		static void preorder(Node1 root) {
			if(root==null)
				return;
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		
		
		static Node1 mirror(Node1 root) {
			if(root==null)
				return null;
			Node1 temp;
			temp=root.left;
			root.left=root.right;
			root.right=temp;
			mirror(root.left);
			mirror(root.right);
			return root;
		}
		
		static Node1 insert(Node1 root,int key) {
			if(root==null)
			return createNode(key);
			
			if(root.data<key) {
			root.right=insert(root.right,key);
			}
			else
				root.left=insert(root.left,key);
			return root;
		}
		
		public static Node1 createNode(int key) {
			Node1 node =new Node1(key);
			return node;
		}


		static boolean search(Node1 root, int key) {
			if(root==null)
				return false;
			if(root.data==key)
				return true;
			else if(root.data<key) {
			return	search(root.right,key);
			}
			else {
			return search(root.left,key);
			}
		}
		
		static Node1 delete(Node1 root,int key) {
			if(root==null)
				return root;
			if(root.data<key) {
				root.right=delete(root.right,key);
			}
			else if(root.data>key) {
				root.left=delete(root.left,key);
			}
			else {
				if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				else {
					root.data=findmax(root.left);
					root.left=delete(root.left,root.data);
				}
			}
			return root;
		}
		
	public static int findmax(Node1 root) {
			if(root==null)
				return Integer.MIN_VALUE;
			int a=findmax(root.left);
			int b=findmax(root.right);
			
			return Math.max(root.data, Math.max(a, b));
		}


	static void levelOrder(Node1 root1) {
		Node1 current;
		Queue<Node1> qu= new LinkedList<Node1>();
		qu.add(root1);
		while(!qu.isEmpty()) {
			current= qu.peek();
			System.out.print(qu.peek().data+" ");
			qu.remove();
			if(current.left!=null)
			{
			qu.add(current.left);
			}
			if(current.right!=null)
			{
			qu.add(current.right);
			}
		}	
	}
	
	static void levelOrderEachLine(Node1 root1) {
		Node1 current;
		Node1 temp = null;
		Queue<Node1> qe= new LinkedList<Node1>();
		qe.add(root1);
		System.out.println();
		qe.add(temp);
		while(!qe.isEmpty()) {
			
			if(qe.peek()==temp)
			{
				System.out.println();
				qe.remove();
				if(qe.isEmpty())
				{
					break;
				}
				else
				{
					qe.add(temp);
					
				}
				
			}
			else {
			current= qe.peek();
			System.out.print(current.data+" ");
			qe.remove();
			if(current.left!=null)
			{
			qe.add(current.left);
			}
			if(current.right!=null)
			{
			qe.add(current.right);
			}
			}
			
		}	
	}
	

	/*
	 * public static void swap(Node1 left, Node1 right) { Node1 temp; temp=left;
	 * left=right; right=temp;
	 * 
	 * }
	 */



	public static void main(String[] args) {
		Node1 root ;
	//	Node1 root1;
		root= new Node1(4);
		root.left= new Node1(2);
		root.right=new Node1(5);
		root.left.left=new Node1(1);
		root.left.right=new Node1(3);
		/*
		 * System.out.println("The elements before mirror :"); preorder(root);
		 * mirror(root); System.out.println("The elements after mirror :");
		 * preorder(root); levelOrder(root); levelOrderEachLine(root);
		 */
	//	System.out.println("The element "+search(root,1));
		System.out.println(insert(root,7));
		 preorder(root);
		 System.out.println(delete(root,2));
		 preorder(root);
	}

}
