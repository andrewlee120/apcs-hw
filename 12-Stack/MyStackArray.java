public class MyStackArray {
    private String[] stack;
    private int numElts;
    private int top;
    
    public MyStackArray() {
	stack = new String[10];
	numElts = 0;
	top = 0;
    }

    public void push(String s){
	if (top+1 > stack.length){
	    grow();
	    stack[top+1] = s;
	    top = top + 1;
	    numElts = 0;
	}
	else {
	    stack[top + 1] = s;
	    top = top + 1;
	    numElts = 0;
	}
    }

    public void grow() {
	String[] tmp = new String[stack.length/2 + stack.length];
	for (int i = 0; i < top; i++){
	    tmp[i] = stack[i];
	}
	stack = tmp;
    }

    public String pop() {
	String s = stack[top];
	top = top - 1;
	numElts = numElts - 1;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return top == 0;
    }

    public String toString() {
	String s = "";
	for (int i = top; i > 0; i--){
	    s += stack[i] + ", ";
	}
	return s;
    }
}