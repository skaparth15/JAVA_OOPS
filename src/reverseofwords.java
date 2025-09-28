import java.util.Arrays;
import java.util.Comparator;

public class reverseofwords {

    public static void main(String[]args){
        String s= "hi have a nice day";
        String[] res = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=res.length-1;i>=0;i--){
            sb.append(res[i]);
            if(i !=0){
                sb.append(" ");
            }

        }

   String result =sb.toString();
        System.out.print(result);


        }
    }

