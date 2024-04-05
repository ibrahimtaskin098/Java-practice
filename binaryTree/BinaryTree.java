package binaryTree;

import java.util.Queue;
import java.util.LinkedList;

import java.util.Stack;

public class BinaryTree {

    Node root;

    public static class Node {

        int val;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(int val) {
            this.val = val;
            left = right = null;
        }

    }

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int key) {
        this.root = new Node(key);
    }
    // using recursion

    public static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //  current -left- right
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);

        preOrderTraversal(node.right);

    }

    // using iterative (stack)
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        //  current -left- right
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.val + " ");
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
    // using recursion

    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        // left - current - right
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);

    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = node;
        while (current != null || !stack.isEmpty()) {
                while(current != null){
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                System.out.print(current.val+" ");
                current = current.right;
        }
    }

    // using recursion
    public static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //  left- right - current

        postOrderTraversal(node.left);

        postOrderTraversal(node.right);
        System.out.print(node.val + " ");

    }
// using itterative
    public static void postOrder(Node node){
        if(node ==null){
       return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(node);
        while(!stack1.isEmpty()){
            Node current = stack1.pop();
            stack2.push(current);
            if(current.left != null){
                stack1.push(current.left);
                
            }
            if(current.right != null){
                stack1.push(current.right);
            }
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().val+" ");
        }
    }
    //using iterative (Queue)
// for BFS , there is no recurtion solution.
    public static void levelOrder(Node node) {

        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>(); //FIFO
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("Pre order using recurtion DFS");
        preOrderTraversal(tree.root);
        System.out.println("");
        System.out.println("Pre order using iteration stack DFS");
        preOrder(tree.root);
        System.out.println("");

        System.out.println("In order using recurtion DFS");
        inOrderTraversal(tree.root);
        System.out.println("");
        System.out.println("In order traversal iterative use Stack DFS");
        inOrder(tree.root);
        System.out.println("");

        System.out.println("Post order using recurtion DFS");
        postOrderTraversal(tree.root);
        System.out.println("");
         System.out.println(" post order using iterative DFS");
         postOrder(tree.root);
         System.out.println("");
        System.out.println("Level order using iteration queue BFS");
        levelOrder(tree.root);
        System.out.println("");

    }
}
