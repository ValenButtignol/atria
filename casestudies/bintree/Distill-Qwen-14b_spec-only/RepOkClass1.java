public class RepOkClass1{
        public boolean repOK_1() {
            if (root == null) {
                return size == 0;
            }
    
            // Check that the size is correct
            int calculatedSize = calculateSize(root);
            if (calculatedSize != size) {
                return false;
            }
    
            // Check BST property and no duplicates
            List<Integer> values = new ArrayList<>();
            inorderTraversal(root, values);
    
            for (int i = 0; i < values.size() - 1; i++) {
                if (values.get(i) >= values.get(i + 1)) {
                    return false;
                }
            }
    
            return true;
        }

        private int calculateSize(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + calculateSize(node.left) + calculateSize(node.right);
        }

        private void inorderTraversal(Node node, List<Integer> list) {
            if (node != null) {
                inorderTraversal(node.left, list);
                list.add(node.info);
                inorderTraversal(node.right, list);
            }
        }


}
