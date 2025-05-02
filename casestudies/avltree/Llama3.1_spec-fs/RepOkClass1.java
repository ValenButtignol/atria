public class RepOkClass1{
    public boolean repOK_1() {
        if (isEmpty()) {
            return root == null;
        }
    
        int heightDiff = Math.abs(height(root.left) - height(root.right));
        if (heightDiff > ALLOWED_IMBALANCE) {
            return false;
        }
    
        if (height(root.left) - height(root.right) > ALLOWED_IMBALANCE) {
            if (height(root.left.left) >= height(root.left.right)) {
                return repOKAfterRotateLeft(root);
            } else {
                return repOKAfterDoubleLeft(root);
            }
        } else if (height(root.right) - height(root.left) > ALLOWED_IMBALANCE) {
            if (height(root.right.right) >= height(root.right.left)) {
                return repOKAfterRotateRight(root);
            } else {
                return repOKAfterDoubleRight(root);
            }
        }
    
        return true;
    }

    private boolean repOKAfterRotateLeft(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return repOK_1();
    }

    private boolean repOKAfterRotateRight(AvlNode k1) {
        AvlNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(height(k2.right), k1.height) + 1;
        return repOK_1();
    }

    private boolean repOKAfterDoubleLeft(AvlNode k3) {
        k3.left = repOKAfterRotateRight(k3.left);
        return repOKAfterRotateLeft(k3);
    }

    private boolean repOKAfterDoubleRight(AvlNode k1) {
        k1.right = repOKAfterRotateLeft(k1.right);
        return repOKAfterRotateRight(k1);
    }


}
