class bt {
    int value;
    bt left, right;

    bt(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};

        if (A.length == 0) return;

        bt root = new bt(A[0]);
        bt temp = root;

        for (int i = 1; i < A.length; i++) {
            temp.left = new bt(A[i]); // Assign left child
            temp = temp.left;        // Move to the next node
        }

        // Print the tree (pre-order traversal)
        preOrderTraversal(root);
    }

    public static void preOrderTraversal(bt node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
