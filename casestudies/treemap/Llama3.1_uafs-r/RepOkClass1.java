public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        Node current = root;
        while (current != null) {
            if (current.color == RED) {
                if (current.parent == null) {
                    return false;
                }
                if (current.parent.color == RED) {
                    return false;
                }
                if (current.parent.parent == null) {
                    return false;
                }
            }
            current = current.left;
        }
    
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }


}
