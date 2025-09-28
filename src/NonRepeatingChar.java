import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingChar {


        public Character FirstOccurance (String name) {
            Map<Character, Long> map = name.chars().mapToObj(s1 -> (char) s1).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            for (Map.Entry<Character, Long> result : map.entrySet()) {
                if (result.getValue() == 1) {
                    return result.getKey();

                }

            }
            return 0;


        }
        public  static  void main(String args[] ){
            NonRepeatingChar Nr= new NonRepeatingChar();
            Character re= Nr.FirstOccurance("ccharan");
            System.out.println(re);
    }
}