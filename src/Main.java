public class Main {
    public static void main(String[] args) {
        MyHashSet<Integer> t = new MyHashSet<>();
        t.put(2);
        t.put(4);
        t.put(3);
        t.put(32323);
        t.put(5555);
        t.put(124124);
        t.put(2);
        t.printHashMap();

        t.delete(32323);
        t.delete(124124);
        t.delete(00);
        t.printHashMap();
    }
}