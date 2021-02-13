package project;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	
		
	static class Node {
		String name;             //Name of nodes
		ArrayList<Node> child;   //An array list consisting of child nodes
		
		public Node(String name) 
		{
			this.name = name;
			child = new ArrayList<>();
		}
	};
	
	
	//a function showing access to all the rooms and switches 
	//associated with a particular floor
	
	static void accessTo(Node building) 
	{
		Stack<Node> stack = new Stack<>();      //stack to store elements of building
		stack.push(building);                   //pushing the current node in the stack
		
		while(!stack.isEmpty()) 
		{
			Node temp = stack.pop();          //popping the current node and storing it
			
			if(temp != null)
			{
				System.out.print(temp.name + " ");
				
				//storing the children of this node in the reverse order
				
				for(int i = temp.child.size()-1; i>=0; i--) 
				{
					stack.add(temp.child.get(i));
				}
			}
		}
		
	}
	
	
	
	//Main method
	public static void main(String[] args) {
	
		//initializing the tree
		Node building = new Node("Building");
		(building.child).add(new Node("F1"));
		(building.child).add(new Node("F2"));
		(building.child).add(new Node("F3"));
		(building.child).add(new Node("F4"));
		(building.child.get(0).child).add(new Node("F1R1"));
		(building.child.get(0).child).add(new Node("F1R2"));
		(building.child.get(1).child).add(new Node("F2R1"));
		(building.child.get(2).child).add(new Node("F3R1"));
		(building.child.get(2).child).add(new Node("F3R2"));
		(building.child.get(2).child).add(new Node("F3R3"));
		(building.child.get(3).child).add(new Node("F4R1"));
		(building.child.get(3).child).add(new Node("F4R2"));
		(building.child.get(0).child.get(0).child).add(new Node("F1R1S1"));
		(building.child.get(0).child.get(0).child).add(new Node("F1R1S2"));
		(building.child.get(0).child.get(1).child).add(new Node("F1R2S1"));
		(building.child.get(1).child.get(0).child).add(new Node("F2R1S1"));
		(building.child.get(1).child.get(0).child).add(new Node("F2R1S2"));
		(building.child.get(2).child.get(0).child).add(new Node("F3R1S1"));
		(building.child.get(2).child.get(0).child).add(new Node("F3R1S2"));
		(building.child.get(2).child.get(0).child).add(new Node("F3R1S3"));
		(building.child.get(2).child.get(1).child).add(new Node("F3R2S1"));
		(building.child.get(2).child.get(2).child).add(new Node("F3R3S1"));
		(building.child.get(2).child.get(2).child).add(new Node("F3R3S2"));
		(building.child.get(3).child.get(0).child).add(new Node("F4R1S1"));
		(building.child.get(3).child.get(0).child).add(new Node("F4R1S2"));
		(building.child.get(3).child.get(1).child).add(new Node("F4R2S1"));
		
		
		Scanner sc = new Scanner(System.in);     
		System.out.println("Enter floor number:");
		int x = sc.nextInt();
		
		//printing the preorder traversal of the specified floor
		accessTo(building.child.get(x-1));      
		
	}

	
}
