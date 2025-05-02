public class RepOkClass1{
    public boolean property_1() {
        if (Nodes == null) {
            return true;
        }
    
        BinomialHeapNode current = Nodes;
        while (current != null) {
            int expectedSize = 1 << current.getDegree(); // 2^degree
            int currentLevel = 0;
            int expectedNodesAtLevel = 1 << currentLevel; // 2^level
            int actualNodesAtLevel = 0;
            current = current.child;
            while (current != null) {
                if (current.getDegree() == expectedSize - 1) {
                    if (actualNodesAtLevel != expectedNodesAtLevel) {
                        return false;
                    }
                    expectedLevel = currentLevel;
                    expectedNodesAtLevel = 1 << expectedLevel;
                    actualNodesAtLevel = 0;
                }
                actualNodesAtLevel++;
                current = current.child;
                currentLevel++;
            }
            current = current.sibling;
        }
        return true;
    }


}
