public class MyStackArray {
    private String[] stack;
    private int top;
    
    public MyStackArray() {
	stack = new String[10];
	top = 0;
    }

    public void push(String s){
	if (top+1 > stack.length){
	    grow();
	}
	stack[top] = s;
	top = top + 1;
    }

    public void grow() {
	String[] tmp = new String[stack.length/2 + stack.length];
	for (int i = 0; i < top; i++){
	    tmp[i] = stack[i];
	}
	stack = tmp;
    }

    public String pop() {
	String s = stack[top-1];
	top = top - 1;
	return s;
    }

    public String peek() {
	return stack[top-1];
    }

    public int size() {
	return top;
    }

    public boolean isEmpty() {
	return top == 0;
    }

    public String toString() {
	String s = "";
	for (int i = top-1; i >= 0; i--){
	    s += stack[i] + ", ";
	}
	return s;
    }
}