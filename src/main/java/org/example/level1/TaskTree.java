package org.example.level1;

public class TaskTree {
    //Вычисление максимальной длинны дерева
    int treeDepth(Node root) {
        if (root == null) return 0;
        else if (root.getLeft() == null && root.getRight() == null) return 1;
        else {
            return 1 + Math.max(treeDepth(root.getLeft()), treeDepth(root.getRight()));
        }
    }

    class Node {
        private Node left;
        private Node right;

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
