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
        // Check if the list is empty
        if (size == 0) {
            return (header.next == header) && (header.previous == header);
        }
        // Check that header's next and previous are not pointing to itself (list is not empty)
        if (header.next == header || header.previous == header) {
            return false;
        }
        // Calculate the actual size by traversing the list
        int actualSize = 0;
        Entry current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        // Check if the calculated size matches the stored size
        if (actualSize != size) {
            return false;
        }
        // Check the integrity of each node's links
        current = header.next;
        while (current != header) {
            // Check that the previous node points back correctly
            if (current.previous.next != current) {
                return false;
            }
            // Check that the next node's previous points back correctly
            if (current.next == null || current.next.previous != current) {
                return false;
            }
            current = current.next;
        }
        // Ensure the last node's next is the header
        Entry lastNode = header.previous;
        if (lastNode.next != header) {
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
