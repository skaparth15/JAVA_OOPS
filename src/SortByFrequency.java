import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByFrequency {
    public List sortedByvalue(int arr[]){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
      Map<Integer,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> sortedList = map.entrySet().stream()
                .sorted(
                        Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder())
                                .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                ).flatMap(entry->(Collections.nCopies(entry.getValue().intValue(),entry.getKey())).stream()).collect(Collectors.toList());





      return  sortedList;

    }
    public static void main(String[] args){
        int arr1[] ={1,2,3,2,3,2,3,2,3,2,3,4,5};
        SortByFrequency SF =new SortByFrequency();
        List<Integer> list=SF.sortedByvalue(arr1);
        System.out.print(list);

    }
}
