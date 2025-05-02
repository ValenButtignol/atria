public class RepOkClass1{
    private boolean repOK_1() {
        // Check if the root is null
        if (root == null) {
            return size == 0;
        }
    
        // Check if the root is black
        if (root.color == RED) {
            return false;
        }
    
        // Check if all leaf nodes are black
        checkLeafNodes();
    
        // Check if all nodes are either red or black
        checkNodeColors();
    
        // Check if the tree is self-balancing
        checkSelfBalancing();
    
        return true;
    }

    private void checkLeafNodes() {
        checkLeafNodes(root, true);
    }

    private void checkLeafNodes(Node node, boolean isLeft) {
        if (node == null) {
            return;
        }
    
        if (node.left == null && node.right == null) {
            if (node.color == RED) {
                throw new AssertionError("Leaf node is red");
            }
        } else {
            checkLeafNodes(node.left, false);
            checkLeafNodes(node.right, true);
        }
    }

    private void checkNodeColors() {
        checkNodeColors(root);
    }

    private void checkNodeColors(Node node) {
        if (node == null) {
            return;
        }
    
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                throw new AssertionError("Red node has a red left child");
            }
            if (node.right != null && node.right.color == RED) {
                throw new AssertionError("Red node has a red right child");
            }
        }
    
        checkNodeColors(node.left);
        checkNodeColors(node.right);
    }

    private void checkSelfBalancing() {
        checkSelfBalancing(root, 0);
    }

    private void checkSelfBalancing(Node node, int blackCount) {
        if (node == null) {
            return;
        }
    
        if (node.color == BLACK) {
            blackCount++;
        }
    
        if (node.left != null) {
            checkSelfBalancing(node.left, blackCount);
        }
    
        if (node.right != null) {
            checkSelfBalancing(node.right, blackCount);
        }
    
        if (node.left != null && node.right != null) {
            if (Math.abs(blackCount - node.left.blackCount) > 1) {
                throw new AssertionError("Tree is not self-balancing");
            }
            if (Math.abs(blackCount - node.right.blackCount) > 1) {
                throw new AssertionError("Tree is not self-balancing");
            }
        }
    }

    private int getBlackCount(Node node) {
        if (node == null) {
            return 0;
        }
    
        if (node.color == BLACK) {
            return 1 + getBlackCount(node.left) + getBlackCount(node.right);
        } else {
            return getBlackCount(node.left) + getBlackCount(node.right);
        }
    }


}
