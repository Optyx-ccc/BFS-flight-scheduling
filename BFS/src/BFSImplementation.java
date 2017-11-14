import java.util.*;


public class BFSImplementation {
	final static int n = 15;
	HashMap<String, Node> hm=new HashMap<String,Node>();  

	Node Brazil = new Node("Brazil");
	Node Rome = new Node("Rome");
	Node London = new Node("London");
	Node Hongkong = new Node("Hongkong");
	Node Thailand= new Node("Thailand");
	Node Shanghai = new Node("Shanghai");
	Node Beijing = new Node("Beijing");
	Node Singapore = new Node("Singapore");
	Node Malaysia = new Node("Malaysia");
	Node Tokyo = new Node("Tokyo");
	Node Seoul = new Node("Seoul");
	Node LA = new Node("Los Angeles");
	Node Sydney = new Node("Sydney");
	Node Dubai = new Node("Dubai");
	Node Vietnam = new Node("Vietnam");

	public void buildAjacentList() {

		///////create the nodes
		///////////add them to a hashmap for easier searching later


		hm.put("Brazil",Brazil);
		hm.put("Rome",Rome);
		hm.put("London",London);
		hm.put("Hongkong",Hongkong);
		hm.put("Thailand",Thailand);
		hm.put("Shanghai",Shanghai);
		hm.put("Beijing",Beijing);
		hm.put("Singapore",Singapore);
		hm.put("Malaysia",Malaysia);
		hm.put("Tokyo",Tokyo);
		hm.put("Seoul",Seoul);
		hm.put("LA",LA);
		hm.put("Sydney",Sydney);
		hm.put("Dubai",Dubai);
		hm.put("Vietnam",Vietnam);

		//add them to a adjacentlist array
		//add their vertices connection
		//Brazil
		Brazil.addChild(Rome);
		Brazil.addChild(Hongkong);
		Brazil.addChild(Beijing);
		//Rome
		Rome.addChild(London);
		Rome.addChild(Hongkong);
		Rome.addChild(Brazil);
		Rome.addChild(Shanghai);
		Rome.addChild(Tokyo);
		//London
		London.addChild(Rome);
		London.addChild(Hongkong);
		London.addChild(Thailand);
		London.addChild(Malaysia);
		//Hongkong
		Hongkong.addChild(London);
		Hongkong.addChild(Thailand);
		Hongkong.addChild(Brazil);
		Hongkong.addChild(Shanghai);
		Hongkong.addChild(Beijing);
		Hongkong.addChild(Singapore);
		Hongkong.addChild(Rome);

		//Tokyo
		Tokyo.addChild(LA);
		Tokyo.addChild(Seoul);
		Tokyo.addChild(Shanghai);
		Tokyo.addChild(Beijing);
		//Seoul
		Seoul.addChild(Tokyo);
		Seoul.addChild(LA);
		Seoul.addChild(Sydney);
		Seoul.addChild(Shanghai);
		Seoul.addChild(Singapore);
		//
		//LA
		LA.addChild(Tokyo);
		LA.addChild(Seoul);

	}


	public void buildBFS(String S) {
		Queue<Node> Q = new LinkedList<Node>();	
//		buildAjacentList();
				
//		Node Temp = hm.get(S);
		Node Head = Temp;
		Q.add(Temp);
		Temp.Marked();
		Node looptemp;
		
		while(!Q.isEmpty()) {
			//while Q is not empty, remove from Q
			Temp = Q.remove();
			
			while(!Temp.vertices.isEmpty()) {
				//while there is still vertices, remove, marked and add to DFS
				looptemp = Temp.vertices.removeFirst();
	
				if(!looptemp.getMarked()) {
					//if not marked
					//add to queue, marked the node
					//add to subTree
					
					Q.add(looptemp);
					looptemp.Marked();
					looptemp.addPrevious(Temp);
					Temp.subTree.add(looptemp);
				
				}
			}
			
		}


	}


	public static void main(String [ ] args)
	{
		Queue<Node> Q = new LinkedList<Node>();	
		Node test = new Node("1");
		Node test2 =new Node("2");
		Node test3 =new Node("3");
		
		test.addChild(test2);
		test.addChild(test3);
		test3.addChild(test);

		test2.addChild(test);
		
		Node Head = test2;
		Q.add(test2);
		test2.Marked();
		Node looptemp,Temp;
		
		while(!Q.isEmpty()) {
			//while Q is not empty, remove from Q
			Temp = Q.remove();
			
			while(!Temp.vertices.isEmpty()) {
				//while there is still vertices, remove, marked and add to DFS
				looptemp = Temp.vertices.removeFirst();
	
				if(!looptemp.getMarked()) {
					//if not marked
					//add to queue, marked the node
					//add to subTree
					
					Q.add(looptemp);
					looptemp.Marked();
					looptemp.addPrevious(Temp);
					Temp.subTree.add(looptemp);
				
				}
			}
			
		}


	
	}

}
