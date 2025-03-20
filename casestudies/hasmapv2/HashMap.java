package casestudies.hashmapv2;

public class HashMap<K, V> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int MAXIMUM_CAPACITY = 1 << 30;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public Entry<K, V>[] table;
    int size;
    int threshold;
    final float loadFactor;
    public volatile int modCount;

    public HashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        }
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
        }

        int capacity = 1;
        while (capacity < initialCapacity)
            capacity <<= 1;

        this.loadFactor = loadFactor;
        threshold = (int) (capacity * loadFactor);
        table = getNewTable(capacity);
        for (int i = 0; i < table.length; i++)
            table[i] = null;

        init();
    }

    public HashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public HashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
        table = getNewTable(DEFAULT_INITIAL_CAPACITY);
        init();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public V get(K key) {
        Object k = maskNull(key);
        int hash = hash(k);
        int i = indexFor(hash, table.length);
        Entry<K, V> e = table[i];
        while (e != null) {
            if (e.hash == hash && eq(k, e.key))
                return e.value;
            e = e.next;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public V put(K key, V value) {
        Object k = maskNull(key);
        int hash = hash(k);
        int i = indexFor(hash, table.length);

        for (Entry<K, V> e = table[i]; e != null; e = e.next) {
            if (e.hash == hash && eq(k, e.key)) {
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }

        modCount++;
        addEntry(hash, (K) k, value, i);
        return null;
    }

    public V remove(K key) {
        Entry<K, V> e = removeEntryForKey(key);
        return (e == null ? null : e.value);
    }

    public void clear() {
        modCount++;
        for (int i = 0; i < table.length; i++)
            table[i] = null;
        size = 0;
    }

    private void init() {
    }

    private static final Object NULL_KEY = new Object();

    private static <K> Object maskNull(K key) {
        return (key == null ? NULL_KEY : key);
    }

    private static <K> Object unmaskNull(K key) {
        return (key == NULL_KEY ? null : key);
    }

    private static int hash(Object x) {
        int h = x.hashCode();
        h += ~(h << 9);
        h ^= (h >>> 14);
        h += (h << 4);
        h ^= (h >>> 10);
        return h;
    }

    private static boolean eq(Object x, Object y) {
        return x == y || x.equals(y);
    }

    private static int indexFor(int h, int length) {
        return h & (length - 1);
    }

    @SuppressWarnings("unchecked")
    private Entry<K, V>[] getNewTable(int capacity) {
        return new Entry[capacity];
    }

    private void addEntry(int hash, K key, V value, int bucketIndex) {
        table[bucketIndex] = new Entry<>(hash, key, value, table[bucketIndex]);
        if (size++ >= threshold)
            resize(2 * table.length);
    }

    private Entry<K, V> removeEntryForKey(K key) {
        Object k = maskNull(key);
        int hash = hash(k);
        int i = indexFor(hash, table.length);
        Entry<K, V> prev = table[i];
        Entry<K, V> e = prev;

        while (e != null) {
            Entry<K, V> next = e.next;
            if (e.hash == hash && eq(k, e.key)) {
                modCount++;
                size--;
                if (prev == e)
                    table[i] = next;
                else
                    prev.next = next;
                return e;
            }
            prev = e;
            e = next;
        }

        return null;
    }

    private void resize(int newCapacity) {
        Entry<K, V>[] oldTable = table;
        int oldCapacity = oldTable.length;
        if (oldCapacity == MAXIMUM_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return;
        }

        Entry<K, V>[] newTable = getNewTable(newCapacity);
        transfer(newTable);
        table = newTable;
        threshold = (int) (newCapacity * loadFactor);
    }

    private void transfer(Entry<K, V>[] newTable) {
        for (Entry<K, V> e : table) {
            while (e != null) {
                Entry<K, V> next = e.next;
                int i = indexFor(e.hash, newTable.length);
                e.next = newTable[i];
                newTable[i] = e;
                e = next;
            }
        }
    }

    public static class Entry<K, V> {
        public final K key;
        public V value;
        public int hash;
        Entry<K, V> next;

        Entry(int h, K k, V v, Entry<K, V> n) {
            value = v;
            next = n;
            key = k;
            hash = h;
        }

        @SuppressWarnings("unchecked")
        public K getKey() {
            return (K) unmaskNull(key);
        }

        public V getValue() {
            return value;
        }

        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
    }
}
