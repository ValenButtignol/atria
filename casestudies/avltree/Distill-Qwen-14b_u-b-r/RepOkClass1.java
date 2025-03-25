public class RepOkClass1{
    public boolean repOK() {
        try {
            if (root == null) {
                return true;
            }
            computeHeightAndCheck(root);
            return true;
        } catch (InvariantViolatedException e) {
            return false;
        }
    }

    private int computeHeightAndCheck(AvlNode node) {
        if (node == null) {
            return -1;
        }
    
        int leftHeight = computeHeightAndCheck(node.left);
        int rightHeight = computeHeightAndCheck(node.right);
    
        int expectedHeight = 1 + Math.max(leftHeight, rightHeight);
        if (node.height != expectedHeight) {
            throw new InvariantViolatedException();
        }
    
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > ALLOWED_IMBALANCE) {
            throw new InvariantViolatedException();
        }
    
        return expectedHeight;
    }

    private static class InvariantViolatedException extends RuntimeException {
        // Exception thrown when the representation invariant is violated.
    }


}
