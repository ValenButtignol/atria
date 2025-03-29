public class RepOkClass3{
    public boolean property() {
        return !hasCycle(root);
    }

    private boolean hasCycle(AvlNode node) {
        if (node == null)
            return false;
    
        if (node.left == node || node.right == node)
            return true;
    
        return hasCycle(node.left) || hasCycle(node.right);
    }


}
