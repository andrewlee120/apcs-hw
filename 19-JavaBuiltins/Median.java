import java.io.*;
import java.util.*;

public class Median {
    private PriorityQueue<Integer> upper;
    private PriorityQueue<Integer> lower;

    public Median(){
	lower = new PriorityQueue(100,new Comparator<Integer>(){
		public int compare(Integer a, Integer b){
		    return -a.compareTo(b);
		}
	    });
	upper = new PriorityQueue<Integer>(100);
    }

    public void adding(Integer n){
	if (upper.size() == 0){
	    upper.add(n);
	    return;
	}
	else if (lower.size() == 0){
	    lower.add(n);
	    return;
	}
	if (n < lower.peek()){
	    lower.add(n);
	}
	else {
	    upper.add(n);
	}
	if (upper.size() - lower.size() == 2){
	    lower.add(upper.poll());
	}
	else if (lower.size() - upper.size() == 2){
	    upper.add(lower.poll());
	}
    }

    public double findMedian(){
	if (upper.size() == lower.size()){
	    return (upper.peek()+lower.peek())/2.0;
	}
	else if (upper.size() > lower.size()){
	    return upper.peek();
	}
	else{
	    return lower.peek();
	}
    }
}