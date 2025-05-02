public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
        
        if (size < 1) {
            return false;
        }
        
        int nodeCount = countNodes(root);
        if (nodeCount != size) {
            return false;
        }
        
        return isTreeStructureValid(root);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isTreeStructureValid(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.left != null && node.left.parent != node) {
            return false;
        }
        
        if (node.right != null && node.right.parent != node) {
            return false;
        }
        
        return isTreeStructureValid(node.left) && isTreeStructureValid(node.right);
    }


}
