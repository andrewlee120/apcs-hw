import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args){
	HashMap h = new HashMap();
	TreeMap t = new TreeMap();
	long start,elapsed;
	int num = 1000000;
	
	start = System.currentTimeMillis();
	for (int i = 0; i < num; i++){
	    h.put(i,i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("HashMap time: " + elapsed + " for " + num + " items.");
	
	start = System.currentTimeMillis();
	for (int i = 0; i < num; i++){
	    t.put(i,i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("TreeMap time: "+elapsed+" for " +num+" items.");
    }
}