package com.duanndz.core.algorithm.analysis.stacks;

import java.util.List;
import java.util.Stack;

/**
 * @author by duannguyen at 22/09/2017 13:50
 */
public class StackMain {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("stack empty: " + stack.empty());
		System.out.println("stack isEmpty: " + stack.isEmpty());
		stack.push(1);
		System.out.println("Top is: " + stack.peek()); //element at top
		stack.push(3);
		System.out.println("POP is: " + stack.pop());
		stack.push(5);
		System.out.println("stack size: " + stack.size());
		System.out.println("position of 5 is: " + stack.search(5));

	}

}
