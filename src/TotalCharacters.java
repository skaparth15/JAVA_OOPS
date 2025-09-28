import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class TotalCharacters {
    public static void main(String args[]){
        String name="sricharan";
        Map<Character,Long>map= name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for (Map.Entry<Character,Long> mapiterator: map.entrySet()){
            System.out.println("key: "+mapiterator.getKey()+" value : "+ mapiterator.getValue());

        }

    }
}
