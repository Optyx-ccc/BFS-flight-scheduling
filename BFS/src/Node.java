import java.util.ArrayList;
import java.util.LinkedList;

public class Node {
	String Data;
	boolean marked = false;
	Node Previous;
	public LinkedList<Node> vertices = new LinkedList<Node>();
	public LinkedList<Node> subTree = new LinkedList<Node>();
	public Node(String s) {
		this.Data = s;
	}
	public void Marked() {
		marked = true;
	}
	public boolean getMarked() {
		return this.marked;
	}
	public String getData() {
		return this.Data;
	}
	public void addPrevious(Node N) {
		Previous = N;
	}
	public void addChild(Node n) {
		vertices.add(n);
	}

}
