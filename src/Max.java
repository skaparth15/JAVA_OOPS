import java.util.*;

public class Max {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> num=list.stream().max(Comparator.naturalOrder());
        System.out.print(num);



    }
}
