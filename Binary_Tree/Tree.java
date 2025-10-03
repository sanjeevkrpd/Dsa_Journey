package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;


public class Tree {

    // 1 2 3 4 5 6 7 8 9
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int tree[]) {
            idx++;

            if (idx >= tree.length || tree[idx] == -1) {
                return null;
            }

            Node newNode = new Node(tree[idx]);
            newNode.left = buildTree(tree);
            newNode.right = buildTree(tree);
            return newNode;

        }

    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();

        if (root == null) {
            return;
        }
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

        }
    }

    // height of a tree

    public static int hightofTree(Node root){
        if (root == null) {
            return 0;
        }
        int left_height = hightofTree(root.left);
        int right_height = hightofTree(root.right);

        return Math.max(left_height, right_height) + 1;
    }

    public static void main(String[] args) {

        int tree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6 };

        Node root = BinaryTree.buildTree(tree);

        System.out.println("inOrderTraversal");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("preOrderTraversal");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("postOrderTraversal");
        postOrderTraversal(root);

        levelOrder(root);

        System.out.println(" Height ");
        System.out.print(hightofTree(root));
    }
}
