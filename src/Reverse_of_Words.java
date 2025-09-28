import java.util.Arrays;
import java.util.Comparator;

public class Reverse_of_Words {
    public static void main(String args[]){
        String st="java is powerful";
        String reversedWord="";
        String arr[] = st.split(" ");
        StringBuilder reversed =new StringBuilder();
        //Arrays.sort(arr, Comparator.reverseOrder());
        for(int i=arr.length-1 ;i>=0;i--){
             reversed.append(arr[i]+" ");


        }
        System.out.print(reversed.toString());
    }
}
