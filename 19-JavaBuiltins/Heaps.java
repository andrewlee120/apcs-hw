import java.io.*;
import java.util.*;

public class Heaps{
    private int minheap[] = new int[100];
    public int imin, cmin, pmin;
    public boolean good = true;

    public void minadd(int n){
	minheap[imin] = n;
	pmin = (imin+1)/2 - 1;
	if (pmin < 0){
	    imin = imin + 1;
	    return;
	    }
	cmin = imin;
	    while(good){
		if (minheap[cmin] < minheap[pmin]){
		    int temp = minheap[cmin];
		    minheap[cmin] = minheap[pmin];
		    minheap[pmin] = temp;
		    if (pmin == 0){
			break;
		    }
		    cmin = pmin;
		    pmin = (pmin+1)/2 - 1;
		}
		else{
		    break;
		}
	    }
	    imin = imin + 1;
    }

    private int[] maxheap = new int[100];
    private int imax,cmax,pmax;

    public void maxadd(int n){
	maxheap[imax] = n;
	pmax = (imax+1)/2 - 1;
	if (pmax < 0){
	    imax = imax + 1;
	    return;
	}
	cmax = imax;
	while(good){
	    if (maxheap[cmax] > maxheap[pmax]){
		int temp = maxheap[cmax];
		maxheap[cmax] = maxheap[pmax];
		maxheap[pmax] = temp;
		if (pmax == 0){
		    break;
		}
		cmax = pmax;
		pmax = (pmax+1)/2 -1;
	    }
	    else {
		break;
	    }
	}
	imax = imax + 1;
    }


    public double findMedian(){
	if (imax == imin){
	    return (maxheap[imax] + minheap[imin])/2.0;
	}
	else if (imax > imin){
	    return maxheap[imax];
	}
	else {
	    return minheap[imin];
	}
    }

    public double removeMedian(){
	double med = findMedian();
	if (med == minheap[imin]){
	    imin = imin - 1;
	}
	else if (med == maxheap[imax]){
	    imax = imax - 1;
	}
	else {
	    imin = imin - 1;
	    imax = imax - 1;
	}
	return med;
    }
}