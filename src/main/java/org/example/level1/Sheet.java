package org.example.level1;

public class Sheet {
    int treeLeafCount(Node root) {
        if (root == null) return 0;
        else if (root.getLeft() == null && root.getRight() == null) return 1;
        else {
            return treeLeafCount(root.getLeft()) + treeLeafCount(root.getRight());
        }
    }

    int treeLeafCount2(Node root) {
        if (root == null) return 0;
        Node ln = root.getLeft(), rg = root.getRight();
        return (ln==null && rg==null) ? 1 : treeLeafCount(ln) + treeLeafCount(rg);
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
