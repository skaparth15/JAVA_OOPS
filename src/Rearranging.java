import java.lang.reflect.Array;
import java.util.*;
public class Rearranging {

    public int []  arranging_of_integers(int arr[]){
        int expected_array[]=new int[arr.length];
       int  Right_most=arr.length-1;
       int Left_most= 0;


        for(int arr1: arr){
            if(arr1<0){
                expected_array[Left_most]=arr1;
                Left_most++;
            }
            else if(arr1>=0){
                expected_array[Right_most]=arr1;
                Right_most--;

            }
        }

        if(expected_array.length==arr.length){
            return expected_array;
        }
        return null;

    }

    public static void main(String args[]){
        Rearranging re= new Rearranging();
        int nums[]={1,2,-5,-3,6};
        int resultant_nums[]=re.arranging_of_integers(nums);

       // for(int num :resultant_nums){
         //   System.out.print(num+" ");
        //}
        System.out.print(resultant_nums);

    }
}
