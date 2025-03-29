public class RepOkClass1{
    public boolean repOK() {
        if (size != countNodes(header)) {
            return false;
        }
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        if (!isCacheConsistent()) {
            return false;
        }
        if (!isNoDuplicates()) {
            return false;
        }
        return true;
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        for (LinkedListNode current = node; current != node; current = current.next) {
            count++;
        }
        return count;
    }

    private boolean isCacheConsistent() {
        for (LinkedListNode node = firstCachedNode; node != null; node = node.next) {
            if (!contains(node.getValue())) {
                return false;
            }
        }
        return true;
    }

    private boolean contains(Object value) {
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (isEqualValue(node.getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEqualValue(Object value1, Object value2) {
        return (value1 == value2 || (value1 == null ? false : value1.equals(value2)));
    }

    private boolean isNoDuplicates() {
        Set<Object> values = new HashSet<>();
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (!values.add(node.getValue())) {
                return false;
            }
        }
        return true;
    }


}
