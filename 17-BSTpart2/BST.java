public class BST {
    private Node root;

    public BST(){
	root = null;
    }

    public void insert(int d){
	if (root == null){
	    root = new Node(d);
	    return;
	}
	else {
	    Node cur = root;
	    Node prev = null;
	    while (cur != null){
		if (d < cur.getData()){
		    prev = cur;
		    cur = cur.getLeft();
		}
		else {
		    prev = cur;
		    cur = cur.getRight();
		}
	    }
	    if (d < prev.getData()){
		prev.setLeft(new Node(d));
	    }
	    else {
		prev.setRight(new Node(d));
	    }
	}
    }

    public Node search(int d){
	Node cur = root;
	while (cur != null){
	    if (d < cur.getData()){
		cur = cur.getLeft();
	    }
	    else if (d > cur.getData()){
		cur = cur.getRight();
	    }
	    else {
		return cur;
	    }
	}
	return null;
    }

    public Node search2(Node c, int x){
	if (c == null){
	    return c;
	}
	if (c.getData() == x){
	    return c;
	}
	if (x < c.getData()){
	    return search2(c.getLeft(),x);
	}
	else {
	    return search2(c.getRight(),x);
	}
    }
    
    public void delete(int x){
	deleteHelper(x,root);
    }

    public void deleteHelper(int x, Node n){
	if (n == null){
	    return;
	}
	Node cur = n;
	if (x < cur.getData()){
	    deleteHelper(x,cur.getLeft());
	}
	else if (x > cur.getData()){
	    deleteHelpter(x,cur.getRight());
	}
	else {
	    if (cur.getLeft() != null && cur.getRight() != null){
		Node l = cur.getLeft();
		Node r = cur.getRight();
	    }
	}
    }
}