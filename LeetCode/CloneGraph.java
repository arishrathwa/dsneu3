package LeetCode;

import java.util.*;
/*
// Definition for a Node.*/
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
/**/
public class CloneGraph {

	    public Node cloneGraph(Node node) {
	        if(node == null) return null;
	        Node source = new Node(node.val);

	        //BFS traversal
	        Queue<Node> queue = new ArrayDeque<Node>();
	        HashMap<Node,Boolean> visited = new HashMap<Node,Boolean>();
	        HashMap<Integer,Node> copies = new HashMap<Integer,Node>();

	        visited.put(node,true); // marking source as visited
	        queue.add(node);
	        //First time to make copies of all nodes
	        while(!queue.isEmpty()) {
	            Node n = queue.remove(); 
	            
	            Node newNode = new Node(n.val);
	            copies.put(newNode.val,newNode);
	            //iterating adjacent nodes
	            for(Node currNode:n.neighbors) {
	                if(visited.get(currNode) == null) {
	                    visited.put(currNode,true);
	                    queue.add(currNode);
	                }
	            }
	        }
	      
	        //second time to connect new copies of adjacent nodes
	        
	        
	        for(Node n : visited.keySet()){ 
	            int u = n.val;
	            //iterating adjacent nodes
	            List<Node> adjNodes = new ArrayList<>();
	            for(Node currNode:n.neighbors) {    
	                    //copies
	                    adjNodes.add(copies.get(currNode.val));
	            }
	            Node nt = copies.get(u);
	            nt.neighbors = adjNodes;
	        }
	        return copies.get(node.val);
	    }
	    


}
