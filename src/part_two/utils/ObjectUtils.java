package part_two.utils;

import java.util.HashSet;
import java.util.List;

public class ObjectUtils {
    public static <T> Integer getCountOfUniqueObjects(List<T> objects) {
        return new HashSet<T>(objects).size();
    }
}
