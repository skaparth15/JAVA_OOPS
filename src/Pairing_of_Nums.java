import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pairing_of_Nums {
    public List<List<Integer>> pairingForTarget(int arr[], int target) {
        List<List<Integer>> Resultant_list = new ArrayList<>();
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (int arr1 : arr) {
            int required = target - arr1;
            if (map.getOrDefault(required,0L) > 0L ) {
                Resultant_list.add(Arrays.asList(required, arr1));

                map.put(required, map.getOrDefault(required, 0L) - 1);
                map.put(arr1, map.getOrDefault(arr1, 0L)-1);


            }



        }
        return Resultant_list;
    }
        public static void main(String args[]){

        int arr[]={1,2,3,4,5};
        int target =5;
        Pairing_of_Nums pn = new Pairing_of_Nums();
        List<List<Integer>>listed=pn.pairingForTarget(arr,target);
        System.out.print(listed);
    }

}
