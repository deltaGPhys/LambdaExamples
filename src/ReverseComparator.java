import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;  // that's backwards!
    }
}