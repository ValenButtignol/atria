public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        return repOKRecursive(root);
    }

    private boolean repOKRecursive(Node current) {
        if (current == null) {
            return true;
        }
    
        if (current.left != null && current.info <= current.left.info) {
            return false;
        }
    
        if (current.right != null && current.info <= current.right.info) {
            return false;
        }
    
        return repOKRecursive(current.left) && repOKRecursive(current.right);
    }

    public static void main(String[] args) {
        BinTree binTree = new BinTree();
        binTree.add(5);
        binTree.add(3);
        binTree.add(7);
        binTree.add(2);
        binTree.add(4);
        binTree.add(6);
        binTree.add(8);
    
        System.out.println(binTree.repOK()); // prints: true
    
        binTree.add(1); // adds a value that breaks the BST property
    
        System.out.println(binTree.repOK()); // prints: false
    }


}
