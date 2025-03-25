public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        if (countNodes(root) != size) {
            return false;
        }
    
        checkColors(root);
        checkBalance(root);
    
        return true;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private void checkColors(Node node) {
        if (node == null) {
            return;
        }
    
        if (node.color == BLACK && node.parent != null && node.parent.color == BLACK) {
            return false;
        }
    
        if (node.color == RED && node.parent != null && node.parent.color == RED) {
            return false;
        }
    
        checkColors(node.left);
        checkColors(node.right);
    }

    private void checkBalance(Node node) {
        if (node == null || node.left == null && node.right == null) {
            return;
        }
    
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
    
        if (leftDepth != rightDepth) {
            return false;
        }
    
        checkBalance(node.left);
        checkBalance(node.right);
    }

    private int getDepth(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }


}
