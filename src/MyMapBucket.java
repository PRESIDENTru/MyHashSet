import java.util.LinkedList;
import java.util.List;

public class MyMapBucket<T> {
    private List<T> entries;

    public MyMapBucket() {
        this.entries = new LinkedList<>();
    }

    public List<T> getEntries() {
        return entries;
    }

    public void addEntry(T entry) {
        entries.add(entry);
    }

    public void removeEntry(T entry) {
        entries.remove(entry);
    }
}
