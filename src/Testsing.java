import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testsing {

   /* public static void main(String[] args) {

        int[] arr = {6, 9, 12, 1, 2, 5};
        arr = Arrays.stream(arr).map(ass -> {
            if (ass % 3 == 0) {
                ass = ass / 3;
            }
            return ass;
        }).toArray();

        //  System.out.println(Arrays.toString(arr));


        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Poka");
        set.add("ok");
        System.out.println(set);

       Set<Integer> set2 =  set.stream().map(e ->e.length()).collect(Collectors.toSet());
        List<Integer> list3 =  set.stream().map(e ->e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);

    }*/

   /* public static IntStream pseudoRandomStream(int seed) {
        IntStream mult = IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
        return mult;
    }

    public static void main(String[] args) {
        int ded = ((13 * 13) /10) % 1000;
        System.out.println(ded  );
    }*/

    /*public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order)
                .collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));


        System.out.println(list);


    }

    public static void main(String[] args) {


        Stream<Integer> stream = Stream.of(123, 54325, 456, 567, 768, 7689, 78, 35, 132);
        Comparator<? super Integer> comparator = Integer::compare;
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);
        findMinMax(stream, comparator, biConsumer);
    }*/

   /* public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+");

        HashMap<String, Integer> hashMap = new HashMap<>();
        scanner.forEachRemaining(n ->
                hashMap.put(n.toLowerCase(), hashMap.get(n.toLowerCase()) == null ? 1 : hashMap.get(n.toLowerCase()) + 1));

        hashMap.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }*/


    /*public <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order)
                .collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }*/


    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+");*/
        HashMap<String, Integer> hashMap = new HashMap<>();
        new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+").forEachRemaining(n ->
                hashMap.put(n.toLowerCase(), hashMap.get(n.toLowerCase()) == null ? 1 : hashMap.get(n.toLowerCase()) + 1));
        hashMap.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}
