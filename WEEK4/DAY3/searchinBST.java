package WEEK4.DAY3;

public class searchinBST {

    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
       public static Node searchBST(Node root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        if(root.val > val) return searchBST(root.left, val);
        if(root.val < val) return searchBST(root.right, val);
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
        System.out.println(searchBST(root, 7));
    }
}
