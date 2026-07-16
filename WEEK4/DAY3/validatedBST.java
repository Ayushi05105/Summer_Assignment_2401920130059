package WEEK4.DAY3;


public class validatedBST {

    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}

    static boolean flag = true;
    static Node prev = null;
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        if(prev == null) prev = root;
        else if(root.val <= prev.val){
            flag = false;
        }
        else prev = root;
        inorder(root.right);
    }
    public static boolean isValidBST(Node root) {
        flag = true;
        prev = null;
        inorder(root);
        return flag;
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
        System.out.println(isValidBST(root));
    }
}
