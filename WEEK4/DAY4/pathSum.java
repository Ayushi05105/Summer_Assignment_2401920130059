package WEEK4.DAY4;


public class pathSum {

    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        if(root.left==null && root.right == null){
            return targetSum == root.val;
        }
        int remaining = targetSum - root.val;
        return (hasPathSum(root.left,remaining) || hasPathSum(root.right,remaining));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        int targetSum = 3;
        System.out.println(hasPathSum(root, targetSum));
    }
}
