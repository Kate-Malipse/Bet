import java.util.Collection;
import java.util.HashSet;

public class CollectionHelper {
    public static <T> HashSet DeleteDuplicates(Collection<T> collection) {
        return new HashSet(collection);
    }
}
