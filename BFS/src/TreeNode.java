import java.util.LinkedList;

public class TreeNode {
	Node N;
	LinkedList<TreeNode> Linked;
	
	public TreeNode(Node N) {
		this.N = N;
		Linked = new LinkedList<TreeNode>();
		
	}
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	public void setN(Node temp) {
	this.N = temp;
	}
	
	public void addSubTree(TreeNode N) {
		Linked.add(N);
	}

}
