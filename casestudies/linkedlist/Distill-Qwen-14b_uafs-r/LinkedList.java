package casestudies.linkedlist;

import java.util.*;

public class LinkedList {

    private transient Entry header = new Entry(null, null, null);

    private transient int size = 0;

    public LinkedList() {
        header.next = header.previous = header;
    }

    public boolean add(Object o) {
        addBefore(o, header);
        return true;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Entry e = header.next; e != header; e = e.next) {
                if (e.element == null) {
                    remove(e);
                    return true;
                }
            }
        } else {
            for (Entry e = header.next; e != header; e = e.next) {
                if (o.equals(e.element)) {
                    remove(e);
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        header.next = header.previous = header;
        size = 0;
    }

    public int size() {
        return size;
    }

    private Entry addBefore(Object o, Entry e) {
        Entry newEntry = new Entry(o, e, e.previous);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
        return newEntry;
    }

    private void remove(Entry e) {
        if (e == header) {
            throw new NoSuchElementException();
        }
        e.previous.next = e.next;
        e.next.previous = e.previous;
        size--;
    }

    public static class Entry {

        Object element;

        Entry next;

        Entry previous;

        Entry(Object element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

    public boolean repOK_1() {
        if (size == 0) {
            // Check if the list is empty and header forms a cycle with itself
            return (header.next == header) && (header.previous == header) && (header.next.next == header);
        }
        // Check if header's next and previous are not pointing to itself (non-empty list)
        if (header.next == header || header.previous == header) {
            return false;
        }
        // Traverse the list to count nodes and check for null pointers
        Entry current = header.next;
        int count = 0;
        while (current != header) {
            count++;
            // Ensure next and previous are not null for any node except header
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
        // Verify the count matches the size
        if (count != size) {
            return false;
        }
        // Check that the last node's next is header and the first node's previous is header
        Entry lastNode = header.previous;
        Entry firstNode = header.next;
        if (lastNode.next != header || firstNode.previous != header) {
            return false;
        }
        return true;
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
