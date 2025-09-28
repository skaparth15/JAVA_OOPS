import java.util.*;
import java.util.stream.Collectors;

public class example2 {

    private Set<Integer> seen = new HashSet<>();

    public boolean findDuplicate(int num) {
        return seen.add(num); // returns false if already in set (i.e., a duplicate)
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 5, 5, 6));
        example2 example = new example2();

        List<Integer> resultList = list.stream()
                .filter((num)->example.findDuplicate(num))  // using instance method
                .collect(Collectors.toList());

        System.out.println("Unique values: " + resultList);
    }
}
