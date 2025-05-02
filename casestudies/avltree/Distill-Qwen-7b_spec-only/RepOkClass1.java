public class RepOkClass1{
        public boolean repOK_1() {
            return checkBalance(root);
        }

        private boolean checkBalance(node Node) {
            if (node == null) {
                return true;
            }
            if (Math.abs(node.getBalance()) > 1) {
                throw new AssertionFailedException("Balance factor exceeds allowed range (-1 to 1)");
            }
            return checkBalance(node.getLeft()) && checkBalance(node.getRight());
        }


}
