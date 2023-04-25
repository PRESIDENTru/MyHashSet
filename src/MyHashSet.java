public class MyHashSet<T> {
    private int CAPACITY = 10;
    private MyMapBucket[] buckets;
    private int size = 0;
    public MyHashSet() {
        this.buckets = new MyMapBucket[CAPACITY];
    }
    private int getHash(T entry) {
        return (entry.hashCode() & 0xfffffff) % CAPACITY;
    }
    private T getEntry(T entry) {
        int hash = getHash(entry);
        for (int i = 0; i < buckets[hash].getEntries().size(); i++) {
            T myEntry = (T) buckets[hash].getEntries().get(i);
            if (myEntry.equals(entry)) return myEntry;
        }
        return null;
    }

    public boolean contains(T entry) {
        int hash = getHash(entry);
        if (buckets[hash] == null) return false;
        if (getEntry(entry) == null) return false;
        return true;
    }

    public void put(T entry) {
        if (contains(entry)) {
            return;
        } else {
            int hash = getHash(entry);
            if(buckets[hash] == null) {
                buckets[hash] = new MyMapBucket();
            }
            buckets[hash].addEntry(entry);
            size++;
        }
    }

    public T get(T entry) {
        if (contains(entry)) {
            return getEntry(entry);
        } else return null;
    }

    public void delete(T entry) {
        if (contains(entry)) {
            int hash = getHash(entry);
            buckets[hash].removeEntry(entry);
            size--;
        }
    }

    public void printHashMap() {
        for (int i = 0; i < CAPACITY; i++) {
            if (buckets[i] != null) {
                System.out.println("Корзина #" + i);
                for (int j = 0; j < buckets[i].getEntries().size(); j++) {
                    System.out.println(buckets[i].getEntries().get(j));
                }
            }
        }
    }
}
