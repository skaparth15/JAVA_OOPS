import java.util.Arrays;

public class MergeOfTwoSorts {
    public static void main(String[] args){
        int arr1[]={1,3,4,6};
        int arr2[]={2,5,7};
        int resultant_array[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){

            if(arr1[i]<arr2[j] || arr1[i]==arr2[j]) {
                    resultant_array[k++]=arr1[i];
                    i++;


            }
            else{
                resultant_array[k++]=arr2[j];
                j++;
            }}

            while(i< arr1.length){
                resultant_array[k++]=arr1[i++];
            }

            while(j< arr2.length){
                resultant_array[k++]=arr2[j++];
            }




        System.out.print(Arrays.toString(resultant_array));


    }

}
