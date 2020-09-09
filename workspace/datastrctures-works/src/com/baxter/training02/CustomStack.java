package com.baxter.training02;

import java.util.Stack;

public class CustomStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); 
		
		
		stack.push("Krishna"); 
		stack.push("Varinder"); 
		stack.push("Shreyansh"); 
		
		System.out.println(stack.peek());
		stack.pop(); 
		System.out.println(stack.peek());
		stack.pop(); 
		System.out.println(stack.peek());
		
		stack.pop(); 
		System.out.println(stack.peek());

	}
}
