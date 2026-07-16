package WEEK4.DAY1;


public class InvertBinaryTree {

    public static class Node{
    Node root;
    Node left;
    Node right;
    int val;
    public Node(int val){
        this.val = val;
        
    }
}
    public static Node invertTree(Node root) {
        if(root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right =invertTree(l);
        return root;
        
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
        System.out.println(invertTree(root));
    }
    
}
