public class RepOkClass1{
        private boolean repOK_1() {
            return repOK_1(this.root);
        }

        private boolean repOK_1(AvlNode t) {
            if (t == null) {
                return true;
            }
    
            if (t.left != null && t.left.element >= t.element) {
                return false;
            }
    
            if (t.right != null && t.right.element <= t.element) {
                return false;
            }
    
            if (t.left != null && Math.abs(height(t.left) - height(t.right)) > 1) {
                return false;
            }
    
            if (t.right != null && Math.abs(height(t.right) - height(t.left)) > 1) {
                return false;
            }
    
            return repOK_1(t.left) && repOK_1(t.right);
        }

    public class Main {
        public static void main(String[] args) {
            AvlTree tree = new AvlTree();
            tree.insert(5);
            tree.insert(3);
            tree.insert(7);
            tree.insert(2);
            tree.insert(4);
            tree.insert(6);
            tree.insert(8);
    
            System.out.println(tree.repOK_1()); // prints: true
        }
    }


}
