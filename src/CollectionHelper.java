import java.util.Collection;
import java.util.HashSet;

public class CollectionHelper {
    public static <T> HashSet<T> DeleteDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
