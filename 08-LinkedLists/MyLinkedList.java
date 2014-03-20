import java.io.*;
import java.util.*;

public class MyLinkedList {
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }

    public void add(String s) {
    	Node temp = new Node(s);
    	temp.setNext(head);
    	head = temp;
    }

    public String toString() {
	return "" + head;
    }

    public void add2(int i, String s) {
	Node tmp = head;
	for (int j = 0;j<i,j++){
	    if (tmp.getNext() == null && j+1 != i){
		System.exit(0);
	    }
	    else {
		tmp = tmp.getNext();
	    }
	}
	Node str = new Node(s);
	tmp.setNext(str);
    }
    
    public String get(int i) {
	Node tmp = head;
	for (int j = 0;j<i;j++){
	    if (tmp.getNext() == null && j+1 != i){
		System.exit(0);
	    }
	    else {
		tmp = tmp.getNext();
	    }
	}
	return tmp.toString();
    }

    public String set(int i, String s){
	Node tmp = head;
	for (int j = 0; j<i;j++){
	    if (tmp.getNext() == null && j+1 != i){
		System.exit(0);
	    }
	    else {
		tmp = tmp.getNext();
	    }
	}
	Node old = tmp.getNext();
	Node str = new Node(s);
	tmp.getNext(str);
	return old.toString();
    }

    public String remove(int i){
	Node tmp = head;
	for (int j = 0;j<i;j++){
	    if (tmp.getNext() == null && j+1 != i){
		System.exit(0);
	    }
	    else {
		tmp = tmp.getNext();
	    }
	}
	Node old = tmp.getNext();
	tmp = null;
	return old.toString();
    }

    public int find(String s){
	boolean b = false;
	Node tmp = head;
	int count = 0;
	while (!b){
	    if (tmp.toString().equals(s)){
		b = true;
		return count;
	    }
	    else {
		tmp = tmp.getNext();
	    }
	    count = count + 1;
	}
	return count;
    }

    public int length(){
	boolean end = false;
	Node tmp = head;
	int count = 0;
	while (!b){
	    if (tmp == null){
		b = true;
		return count;
	    }
	    else {
		tmp = tmp.getNext();
	    }
	    count = count + 1;
	}
	return count;
    }
}
