public class RepOkClass1{
        public boolean repOK() {
            return repOK(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        private boolean repOK(Node node, int min, int max) {
            if (node == null) {
                return true;
            }
            if (node.value <= min || node.value >= max) {
                return false;
            }
            return repOK(node.left, min, node.value) && repOK(node.right, node.value, max);
        }


}
