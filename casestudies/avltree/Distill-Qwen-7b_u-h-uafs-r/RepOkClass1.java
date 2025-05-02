public class RepOkClass1{
    public boolean repOK_1() {
        if (isEmpty()) {
            return root == null;
        }
    
        Node current = root;
        while (current != null) {
            int balanceFactor = getBalanceFactor(current);
            if (Math.abs(balanceFactor) > ALLOWED_IMBALANCE) {
                return false;
            }
    
            if (!isBST(current)) {
                return false;
            }
    
            current = current.left;
        }
    
        return true;
    }

    private int getBalanceFactor(AvlNode node) {
        return height(node.left) - height(node.right);
    }

    private boolean isBST(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && node.left.element >= node.element) {
            return false;
        }
    
        if (node.right != null && node.right.element <= node.element) {
            return false;
        }
    
        return isBST(node.left) && isBST(node.right);
    }

    private int height(AvlNode node) {
        if (node == null) {
            return -1;
        }
    
        return node.height;
    }


}
