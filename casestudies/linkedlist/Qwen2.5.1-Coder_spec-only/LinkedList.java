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

    public boolean repOK() {
        if (!repOK_2())
            return false;
        return true;
    }

    public boolean repOK_2() {
        // Check if the header is not null
        if (header == null) {
            return false;
        }
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
        // Check if the size is zero, then the header should point to itself
        if (size == 0) {
            return header.next == header && header.previous == header;
        }
        // Check if the size is greater than zero, then the header should not point to itself
        if (size > 0) {
            if (header.next == header || header.previous == header) {
                return false;
            }
        }
        // Check the integrity of the doubly linked list
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
        // Check if the count matches the size
        return count == size;
    }
}
