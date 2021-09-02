package fastcampus;

import java.util.Comparator;

public class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}
