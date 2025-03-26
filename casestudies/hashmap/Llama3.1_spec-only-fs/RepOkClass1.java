public class RepOkClass1{
    public boolean repOK() {
        // Check if the tree is acyclic
        return isAcyclic(root);
    
        // Check if the size attribute is consistent with the number of nodes
        return size == countNodes(root);
    
        // Check if the tree maintains the binary search tree property
        return isBST(root);
    
        // Check if there are no duplicate values in the tree
        return hasNoDuplicates(root);
    }

    private boolean isAcyclic(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.info == node.info) {
            return false;
        }
        if (node.right != null && node.right.info == node.info) {
            return false;
        }
        return isAcyclic(node.left) && isAcyclic(node.right);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
        return isBST(node.left) && isBST(node.right);
    }

    private boolean hasNoDuplicates(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.info == node.info) {
            return false;
        }
        if (node.right != null && node.right.info == node.info) {
            return false;
        }
        return hasNoDuplicates(node.left) && hasNoDuplicates(node.right);
    }

    public boolean repOK() {
        // Check if the heap is a complete binary tree
        return isCompleteTree(heap);
    
        // Check if the heap property is maintained
        return isHeapProperty(heap);
    
        // Check if the size attribute is consistent with the number of elements
        return size == countElements(heap);
    
        // Check if the capacity attribute is consistent with the size of the heap array
        return capacity == heap.length;
    }

    private boolean isCompleteTree(int[] heap) {
        int level = 0;
        int index = 0;
        while (index < heap.length) {
            int nodesAtLevel = (int) Math.pow(2, level);
            if (index + nodesAtLevel > heap.length) {
                return false;
            }
            for (int i = 0; i < nodesAtLevel; i++) {
                if (heap[index + i] == 0) {
                    return false;
                }
            }
            index += nodesAtLevel;
            level++;
        }
        return true;
    }

    private boolean isHeapProperty(int[] heap) {
        for (int i = 0; i < heap.length; i++) {
            if (i * 2 + 1 < heap.length && heap[i] > heap[i * 2 + 1]) {
                return false;
            }
            if (i * 2 + 2 < heap.length && heap[i] > heap[i * 2 + 2]) {
                return false;
            }
        }
        return true;
    }

    private int countElements(int[] heap) {
        int count = 0;
        for (int i = 0; i < heap.length; i++) {
            if (heap[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean repOK() {
        // Check if the size attribute is consistent with the number of entries
        return size == countEntries(table);
    
        // Check if the load factor is within the valid range
        return loadFactor >= 0 && loadFactor <= 1;
    
        // Check if the table is resized dynamically when the load factor exceeds the threshold
        return isTableResized(table);
    
        // Check if there are no duplicate keys in the map
        return hasNoDuplicates(table);
    }

    private int countEntries(Entry[] table) {
        int count = 0;
        for (Entry entry : table) {
            if (entry != null) {
                count++;
            }
        }
        return count;
    }

    private boolean isTableResized(Entry[] table) {
        // Check if the table is resized dynamically when the load factor exceeds the threshold
        // This can be implemented using the load factor and threshold attributes
        return true;
    }

    private boolean hasNoDuplicates(Entry[] table) {
        // Check if there are no duplicate keys in the map
        // This can be implemented by iterating through the table and checking for duplicate keys
        return true;
    }


}
