public class RepOkClass5{
    public boolean property_5() {
        return property_5(root);
    }

    private boolean property_5(AvlNode t) {
        if (t == null)
            return true;
    
        if (t.height != Math.max(height(t.left), height(t.right)) + 1)
            return false;
    
        return property_5(t.left) && property_5(t.right);
    }


}
