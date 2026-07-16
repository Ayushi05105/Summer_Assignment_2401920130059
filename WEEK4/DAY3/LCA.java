package WEEK4.DAY3;


public class LCA {
    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    Node p;
    Node q;
    public Node(int val){
        this.val = val;
    }
}

public static Node lowestCommonAncestor(Node root, Node p, Node q) {
       
        if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        else if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        else return root;
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
        System.out.println(lowestCommonAncestor(root, d, e));

    }

}
