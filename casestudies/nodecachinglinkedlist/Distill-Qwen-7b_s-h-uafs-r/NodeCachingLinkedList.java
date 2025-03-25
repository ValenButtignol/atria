package casestudies.nodecachinglinkedlist;

import java.util.*;

public class NodeCachingLinkedList {

    private LinkedListNode header;

    private int size;

    private int DEFAULT_MAXIMUM_CACHE_SIZE;

    private LinkedListNode firstCachedNode;

    private int cacheSize;

    private int maximumCacheSize;

    public NodeCachingLinkedList() {
        header = new LinkedListNode();
        size = 0;
        cacheSize = 0;
        firstCachedNode = null;
        DEFAULT_MAXIMUM_CACHE_SIZE = 20;
        maximumCacheSize = DEFAULT_MAXIMUM_CACHE_SIZE;
    }

    public boolean remove(Object value) {
        if (value == null)
            throw new IllegalArgumentException();
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (isEqualValue(node.getValue(), value)) {
                removeNode(node);
                return true;
            }
        }
        return false;
    }

    public boolean add(Object value) {
        if (value == null)
            throw new IllegalArgumentException();
        addLast(value);
        return true;
    }

    private boolean addLast(Object o) {
        addNodeBefore(header, o);
        return true;
    }

    private void addNodeBefore(LinkedListNode node, Object value) {
        LinkedListNode newNode = createNode(value);
        addNode(newNode, node);
    }

    private void addNode(LinkedListNode nodeToInsert, LinkedListNode insertBeforeNode) {
        nodeToInsert.next = insertBeforeNode;
        nodeToInsert.previous = insertBeforeNode.previous;
        insertBeforeNode.previous.next = nodeToInsert;
        insertBeforeNode.previous = nodeToInsert;
        size++;
    }

    private LinkedListNode getNodeFromCache() {
        if (cacheSize == 0) {
            return null;
        }
        LinkedListNode cachedNode = firstCachedNode;
        firstCachedNode = cachedNode.next;
        cachedNode.next = null;
        cacheSize--;
        return cachedNode;
    }

    private boolean isCacheFull() {
        return cacheSize >= maximumCacheSize;
    }

    private void addNodeToCache(LinkedListNode node) {
        if (isCacheFull()) {
            return;
        }
        LinkedListNode nextCachedNode = firstCachedNode;
        node.previous = null;
        node.next = nextCachedNode;
        node.setValue(null);
        firstCachedNode = node;
        cacheSize++;
    }

    private LinkedListNode createNode(Object value) {
        LinkedListNode cachedNode = getNodeFromCache();
        if (cachedNode == null) {
            return new LinkedListNode(value);
        } else {
            cachedNode.setValue(value);
            return cachedNode;
        }
    }

    private void removeNode(LinkedListNode node) {
        super_removeNode(node);
        addNodeToCache(node);
    }

    private void super_removeNode(LinkedListNode node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
        size--;
    }

    private boolean isEqualValue(Object value1, Object value2) {
        return (value1 == value2 || (value1 == null ? false : value1.equals(value2)));
    }

    public static class LinkedListNode {

        private LinkedListNode previous;

        private LinkedListNode next;

        private Object value;

        public LinkedListNode() {
            value = null;
            previous = this;
            next = this;
        }

        public LinkedListNode(Object value) {
            this.value = value;
            previous = this;
            next = this;
        }

        public LinkedListNode(LinkedListNode previous, LinkedListNode next, Object value) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public LinkedListNode getPreviousNode() {
            return previous;
        }

        public void setPreviousNode(LinkedListNode previous) {
            this.previous = previous;
        }

        public LinkedListNode getNextNode() {
            return next;
        }

        public void setNextNode(LinkedListNode next) {
            this.next = next;
        }
    }

    public boolean repOK() {
        if (!repOK_2())
            return false;
        return true;
    }

    public boolean repOK_2() {
        // Check that the size matches the number of nodes in the linked list
        if (size != countNodes(header)) {
            return false;
        }
        // Check that cacheSize does not exceed maximumCacheSize
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        // Check that firstCachedNode is null or points to a valid cached node
        if (firstCachedNode != null) {
            LinkedListNode cachedNode = firstCachedNode;
            if (cachedNode.previous != header || cachedNode.next == null) {
                return false;
            }
            // Ensure the cached node is part of the main linked list
            if (!isNodeInList(cachedNode)) {
                return false;
            }
        }
        // Check that cacheSize is non-negative
        if (cacheSize < 0) {
            return false;
        }
        return true;
    }

    private int countNodes(LinkedListNode header) {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }

    private boolean isNodeInList(LinkedListNode node) {
        LinkedListNode current = header.next;
        while (current != header) {
            if (isEqualValue(node.getValue(), current.getValue())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
