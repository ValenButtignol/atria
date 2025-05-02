public class RepOkClass2{
    public boolean property_2() {
        List<Integer> degrees = new ArrayList<>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            degrees.add(current.getDegree());
            current = current.sibling;
        }
    
        if (degrees.isEmpty()) {
            return true;
        }
    
        Collections.sort(degrees);
        int maxDegree = degrees.get(degrees.size() - 1);
    
        for (int i = 0; i <= maxDegree; i++) {
            if (!degrees.contains(i)) {
                return false;
            }
        }
    
        return true;
    }

    public boolean property_2() {
        List<Integer> degrees = new ArrayList<>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            degrees.add(current.getDegree());
            current = current.sibling;
        }
    
        if (degrees.isEmpty()) {
            return true;
        }
    
        Collections.sort(degrees);
        int maxDegree = degrees.get(degrees.size() - 1);
    
        for (int i = 0; i <= maxDegree; i++) {
            if (!degrees.contains(i)) {
                return false;
            }
        }
    
        return true;
    }


}
