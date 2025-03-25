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
    
        // Check root color is black
        if (!root.color) {
            return false;
        }
    
        // Check BST property
        Node current = root;
        while (current != null) {
            if (current.left != null) {
                if (current.left.color && current.left.key.compareTo(current.key) <= 0) {
                    return false;
                }
            }
            if (current.right != null) {
                if (current.right.color && current.right.key.compareTo(current.key) >= 0) {
                    return false;
                }
            }
            current = current.left;
            while (current.left != null && !current.left.color) {
                current = current.left;
            }
            current = current.right;
            while (current.right != null && !current.right.color) {
                current = current.right;
            }
        }
    
        // Check parent pointers
        Node current = root;
        while (current != null) {
            Node parent = current.parent;
            if (parent != null) {
                if (parent.left != null && parent.left != current) {
                    return false;
                }
                if (parent.right != null && parent.right != current) {
                    return false;
                }
            }
            current = current.left;
            while (current != null && current.parent != parent) {
                current = current.left;
            }
            current = current.right;
            while (current != null && current.parent != parent) {
                current = current.right;
            }
        }
    
        return true;
    }


}
