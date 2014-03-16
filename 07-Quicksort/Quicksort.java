import java.io.*;
import java.util.*;

public class Quicksort{
    private Random r = new Random();

    public Integer[] qsort(Integer[] L){
	if (L.length <= 1){
	    return L;
	}
	else {
	    Integer pos = r.nextInt(L.length);
	    Integer pivot = L[pos];
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for (int i = 0;i<L.length;i++){
		if (L[i] < pivot){
		    lower.add(L[i]);
		}
		else if (L[i] > pivot){
		    upper.add(L[i]);
		}
	    }
	    Integer[] l = lower.toArray(new Integer[lower.size()]);
	    Integer[] u = upper.toArray(new Integer[upper.size()]);
	    Integer[] r1 = qsort(l);
	    Integer[] r2 = qsort(u);
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    for (int i = 0;i<r1.length;i++){
		res.add(r1[i]);
	    }
	    res.add(pivot);
	    for (int i = 0;i<r2.length;i++){
		res.add(r2[i]);
	    }
	    L = res.toArray(new Integer[res.size()]);
	}
	return L;
    }

    public int partition(int[] a, int L, int R){
	int wall = L;
	int pos = r.nextInt(R-L)+L;
	int pivot = a[pos];
	int temp = a[pos];
	a[pos] = a[a.length-1];
	a[a.length-1] = temp;
	for (int i = L;i<R;i++){
	    if (a[i] < pivot){
		temp = a[i];
		a[i] = a[wall];
		a[wall] = temp;
		wall = wall + 1;
	    }
	}
	temp = a[wall];
	a[wall] = a[R];
	a[R] = temp;
	return wall;
    }	

    public void qsort2(int[] a,int L, int R){
	if (R - L <= 1){
	    return;
	}
	else {
	    int p = partition(a,L,R);
	    if (p - 1 > L){
		qsort2(a,L,p-1);
	    }
	    if (p + 1 < R){
		qsort2(a,p+1,R);
	    }
	}
    }
}
