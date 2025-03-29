public class RepOkClass5{
    public boolean property() {
        return property(root);
    }

    private boolean property(AvlNode t) {
        if (t == null)
            return true;
    
        if (t.height != Math.max(height(t.left), height(t.right)) + 1)
            return false;
    
        return property(t.left) && property(t.right);
    }


}
