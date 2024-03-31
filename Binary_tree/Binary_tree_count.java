package Binary_tree;
import java.util.*;
public class Binary_tree_count {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
            
        }
    }
    public static int height(Node root){
                    if(root == null){
                        return 0;
                    }
                    int lh = height(root.left);
                    int rh = height(root.right);
                    return Math.max(lh, rh) + 1;

    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

       // System.out.println(height(root));
      // System.out.println(count(root));
      System.out.println(sum(root));
    }
}
