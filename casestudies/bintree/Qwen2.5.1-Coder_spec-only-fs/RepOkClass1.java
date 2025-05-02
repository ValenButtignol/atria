public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) && size == countNodes(root);
    }

    private boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.data <= min || node.data >= max) {
            return false;
        }
    
        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


}
