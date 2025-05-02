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

    public boolean repOK_1() {
        // Check if the size is correct
        if (size != numNodes(header)) {
            return false;
        }
        // Check if the cache is not full beyond its maximum size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        // Check if the first cached node's next is not null and its previous is correctly set
        if (firstCachedNode != null) {
            if (firstCachedNode.next == null || firstCachedNode.previous == null) {
                return false;
            }
        }
        // Check if adding a node to the cache is done correctly
        if (firstCachedNode != null) {
            LinkedListNode nextCachedNode = firstCachedNode.next;
            if (nextCachedNode != null) {
                nextCachedNode.previous.next = firstCachedNode;
                nextCachedNode.previous = firstCachedNode;
            }
        }
        // Check if removing a node from the cache is done correctly
        if (firstCachedNode != null) {
            LinkedListNode cachedNode = firstCachedNode;
            cachedNode.next = null;
            firstCachedNode = cachedNode.next;
            cacheSize--;
        }
        return true;
    }

    private int numNodes(LinkedListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.previous) + numNodes(node.next);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
