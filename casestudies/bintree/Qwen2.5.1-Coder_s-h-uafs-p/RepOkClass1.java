public class RepOkClass1{
    public boolean property_1() {
        return checkForDuplicates(root);
    }

    private boolean checkForDuplicates(Node current) {
        if (current == null) {
            return true;
        }
        if (current.left != null && current.left.info == current.info) {
            return false;
        }
        if (current.right != null && current.right.info == current.info) {
            return false;
        }
        return checkForDuplicates(current.left) && checkForDuplicates(current.right);
    }


}
