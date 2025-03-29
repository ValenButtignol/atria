public class RepOkClass3{
        public boolean property() {
            if (Nodes == null) {
                return true;
            }
    
            if (!checkHeapProperty(Nodes)) {
                return false;
            }
    
            if (!checkStructureProperty(Nodes)) {
                return false;
            }
    
            List<BinomialHeapNode> roots = new ArrayList<>();
            collectRoots(roots);
    
            if (!checkRootDegrees(roots)) {
                return false;
            }
    
            return true;
        }

        private boolean checkHeapProperty(BinomialHeapNode node) {
            if (node == null) {
                return true;
            }
            if (node.parent != null && node.key > node.parent.key) {
                return false;
            }
            return checkHeapProperty(node.child) && checkHeapProperty(node.sibling);
        }

        private boolean checkStructureProperty(BinomialHeapNode node) {
            if (node == null) {
                return true;
            }
            if (node.parent != null && node.degree > node.parent.degree) {
                return false;
            }
            return checkStructureProperty(node.child) && checkStructureProperty(node.sibling);
        }

        private void collectRoots(List<BinomialHeapNode

}
