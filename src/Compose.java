import java.util.HashSet;
import java.util.LinkedHashSet;

public class Compose {
    public static int[] array = {1, 2, 3, 4};
    static HashSet<Integer> chosenIndexes = new LinkedHashSet<>();

    public static void compose(int left) {
        if (left == 0) {
            System.out.println(chosenIndexes);
        }
        for (int i = 0; i < array.length; i++) {
            if (chosenIndexes.contains(array[i])) {
                continue;
            }
            chosenIndexes.add(array[i]);
            compose(left - 1);
            chosenIndexes.remove(array[i]);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= array.length; i ++) {
            compose(i);
        }
    }
}
