
import java.util.*;

public class Main {

    public static void main(String[] args) {

       // This class implements the Set interface, backed by a hash table (actually a HashMap instance).
        // It makes no guarantees as to the iteration order of the set; in particular,
        // it does not guarantee that the order will remain constant over time.
        // This class permits the null element. (From JavaDocs)

        int[] array = new int[100];

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            if (array[i] % 2 == 0)
                set.add(array[i]);

        }

        System.out.println(set);
    }
}
