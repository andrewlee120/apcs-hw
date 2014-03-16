import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Quicksort q = new Quicksort();
	Integer[] L = {5,3,6,8,1,9,2};
	int[] l = {4,2,7,5,1,3,8};
	System.out.println(Arrays.toString(q.qsort(L)));
	q.qsort2(l,0,l.length-1);
    }
}
