import java.io,*;
import java.util.*;

public class MyLLIterator<E> implements Iterator<E>{
    private Node currentnode;

    public MyLLIterator<E>(Node<E> n){
	currentnode = n;
    }

    public boolean hasNext(){
	if (currentnode.getNext() != false){
	    Node<E> temp = currentnode.getNext();
	    currentnode = temp;
	    return true;
	}
	else {
	    return false;
	}
    }

    public E next(){
	if (hasNext()){
	    return currentnode;
	}
	else {
	    return null;
	}
    }

    public void remove(){
    }
}