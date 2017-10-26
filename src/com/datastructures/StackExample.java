package com.datastructures;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> objStack = new Stack<Integer>();
objStack.push(new Integer(2));
objStack.push(new Integer(24));
objStack.push(new Integer(33));
objStack.push(new Integer(1));
objStack.add(new Integer(40));
objStack.add(new Integer(3));
objStack.peek();
System.out.println(objStack);
int x=objStack.pop();
System.out.println(x);
System.out.println(objStack);
	}

}
