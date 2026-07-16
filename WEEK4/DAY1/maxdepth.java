package WEEK4.DAY1;



public class maxdepth {

    public static class Node{
    Node root;
    Node left;
    Node right;
    int val;
    public Node(int val){
        this.val = val;
        
    }
}
    public static int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        Node b = new Node(9);
        Node c = new Node(20);
        Node d = new Node(15);
        Node e = new Node(7);
        root.left = b;
        root.right = c;
        c.left = d;
        c.right = e;
        System.out.println(maxDepth(root));
    }
    
}
