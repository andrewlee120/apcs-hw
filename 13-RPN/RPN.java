import java.io.*;
import java.util.*;

public class RPN {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	MyStack stack = new MyStack();
	boolean yes = true;
	System.out.println("Welcome to the RPN calculator.");
	try {
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.println("If you choose to stop, type EXIT.");
	try {
	    Thread.sleep(1000);
	} catch(Exception e){}
	while (yes) {
	    System.out.print("Please enter a number or operator: ");
	    String s = sc.nextLine();
	    if (s.equals("EXIT")) {
		yes = false;
		System.exit(0);
	    }
	    else if (s.equals("+")){
		int a = Integer.parseInt(stack.pop());
		int b = Integer.parseInt(stack.pop());
		int ans = a + b;
		stack.push(Integer.toString(ans));
		System.out.println(stack.peek());
	    }
	    else if (s.equals("-")){
		int a = Integer.parseInt(stack.pop());
		int b = Integer.parseInt(stack.pop());
		int ans = b - a;
		stack.push(Integer.toString(ans));
		System.out.println(stack.peek());
	    }
	    else if (s.equals("*")){
		int a = Integer.parseInt(stack.pop());
		int b = Integer.parseInt(stack.pop());
		int ans = a * b;
		stack.push(Integer.toString(ans));
		System.out.println(stack.peek());
	    }
	    else if (s.equals("/")){
		int a = Integer.parseInt(stack.pop());
		int b = Integer.parseInt(stack.pop());
		int ans = b / a;
		stack.push(Integer.toString(ans));
		System.out.println(stack.peek());
	    }
	    else {
		try {
		    int temp = Integer.parseInt(s);
		    stack.push(s);
		    System.out.println(stack.peek());
		}
		catch (Exception e) {
		    System.out.print(s + " is an invalid input."+ "\n");
		}
	    }
	}
    }
}
		    