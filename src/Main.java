import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));


        // simple print
        for (int i: arr) {
            System.out.println(i);
        }

        // print with lambda
        arr.forEach(x -> System.out.println(x));




        // map
//        List<Integer> mapped = new ArrayList<>();
//        for (int i: arr) {
//            mapped.add(3 * i);
//        }
//        System.out.println(mapped);
//
//        // map with lambda
//        List<Integer> mapped2 = arr.stream().map(x -> 3 * x).toList();
//        System.out.println(mapped2);







        // filter
//        ArrayList<Integer> filtered = new ArrayList<>();
//        for (int i: arr) {
//            if (i % 2 == 0) {
//                filtered.add(i);
//            }
//        }
//        System.out.println(filtered);
//
//        // filter with lambda
//        ArrayList<Integer> filtered2 = new ArrayList<>();
//        arr.forEach(x -> {
//            if (x % 2 == 0) {
//                filtered2.add(x);
//            }
//        });
//        System.out.println(filtered2);
//
//        // filter with lambda and stream
//        List<Integer> filtered3 = new ArrayList<>();
//        filtered3 = arr.stream().filter(x -> x % 2 == 0).toList();
//        System.out.println(filtered3);
//






        // sort
//        List<Integer> arr1 = new ArrayList<>(arr);
//        List<Integer> sorted = arr1.stream().sorted().toList();
//        System.out.println(sorted);
//
//        List<Integer> arr2 = new ArrayList<>(arr);
//        List<Integer> sorted2 = arr2.stream().sorted(new ReverseComparator()).toList();
//        System.out.println(sorted2);
//
//        List<Integer> arr3 = new ArrayList<>(arr);
//        List<Integer> sorted3 = arr3.stream().sorted((x,y) -> y - x).toList();
//        System.out.println(sorted3);





//        // behavior as an input!
        List<Integer> filtered4 = new ArrayList<>();
        Predicate<Integer> predicate = x -> x % 2 == 0;
        filtered4 = arr.stream().filter(predicate).toList();
        System.out.println(filtered4);

        Function<List<Integer>, List<Integer>> dropLowest = x -> x.stream().sorted()
                .limit(x.size() - 1)
                .skip(1)
                .toList();

        Function<List<Integer>, List<Integer>> dropBelow5 = x -> x.stream()
                .filter(y -> y >= 5)
                .toList();

        List<Integer> arr4 = new ArrayList<>(arr);
        List<Integer> arr5 = new ArrayList<>(arr);

        List<Integer> sorted4 = dropLowest.apply(arr4);
        System.out.println(sorted4);
        List<Integer> sorted5 = dropBelow5.apply(arr5);
        System.out.println(sorted5);
    }
}

