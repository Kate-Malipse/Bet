import java.util.Collection;
import java.util.HashSet;

public class MyCollection {
    public static  <T> HashSet DeleteDuplicates(Collection<T> collection) {
        return new HashSet(collection);
    }
}
