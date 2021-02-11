package project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;



public class Main {
	static class Node {
		String name;
		ArrayList<Node> child;
		
		public Node(String name)
		{
			this.name = name;
			child = new ArrayList<>();
		}
	};
	
	static void accessTo(Node floor) 
	{
		Stack<Node> stack = new Stack<>();
		stack.push(floor);
		
		while(!stack.isEmpty()) 
		{
			Node temp = stack.pop();
			
			if(temp != null)
			{
				System.out.print(temp.name + " ");
				for(int i = temp.child.size()-1; i>=0; i--) 
				{
					stack.add(temp.child.get(i));
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		Node floor = new Node("Building");
		(floor.child).add(new Node("F1"));
		(floor.child).add(new Node("F2"));
		(floor.child).add(new Node("F3"));
		(floor.child).add(new Node("F4"));
		(floor.child.get(0).child).add(new Node("F1R1"));
		(floor.child.get(0).child).add(new Node("F1R2"));
		(floor.child.get(1).child).add(new Node("F2R1"));
		(floor.child.get(2).child).add(new Node("F3R1"));
		(floor.child.get(2).child).add(new Node("F3R2"));
		(floor.child.get(2).child).add(new Node("F3R3"));
		(floor.child.get(3).child).add(new Node("F4R1"));
		(floor.child.get(3).child).add(new Node("F4R2"));
		(floor.child.get(0).child.get(0).child).add(new Node("F1R1S1"));
		(floor.child.get(0).child.get(0).child).add(new Node("F1R1S2"));
		(floor.child.get(0).child.get(1).child).add(new Node("F1R2S1"));
		(floor.child.get(1).child.get(0).child).add(new Node("F2R1S1"));
		(floor.child.get(1).child.get(0).child).add(new Node("F2R1S2"));
		(floor.child.get(2).child.get(0).child).add(new Node("F3R1S1"));
		(floor.child.get(2).child.get(0).child).add(new Node("F3R1S2"));
		(floor.child.get(2).child.get(0).child).add(new Node("F3R1S3"));
		(floor.child.get(2).child.get(1).child).add(new Node("F3R2S1"));
		(floor.child.get(2).child.get(2).child).add(new Node("F3R3S1"));
		(floor.child.get(2).child.get(2).child).add(new Node("F3R3S2"));
		(floor.child.get(3).child.get(0).child).add(new Node("F4R1S1"));
		(floor.child.get(3).child.get(0).child).add(new Node("F4R1S2"));
		(floor.child.get(3).child.get(1).child).add(new Node("F4R2S1"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter floor number:");
		int x = sc.nextInt();
		
		
		accessTo(floor.child.get(x-1));
		
	}

	
}
