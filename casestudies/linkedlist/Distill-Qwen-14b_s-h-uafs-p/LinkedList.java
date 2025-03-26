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
        if (!property())
            return false;
        if (!property_2())
            return false;
        if (!property_3())
            return false;
        return true;
    }

    public boolean property() {
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count == size;
    }

    public boolean property_2() {
        return size >= 0;
    }

    public boolean property_3() {
        Entry current = header.next;
        while (current != header) {
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
