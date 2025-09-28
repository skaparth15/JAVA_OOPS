public class AddingTwoNumsForTarget {

    public int targetedValue(int arr[],int value){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int expected_value=value-arr[i];
            for(int j=0; j<arr.length-1;j++){
                if(!(arr[i]==arr[j]) &&
                        arr[j]==expected_value){
                    count++;
                }

            }
        }
        if(count>0){
            return count/2;
        }
        return  0;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,2,4};
        AddingTwoNumsForTarget  tar=new AddingTwoNumsForTarget();
      int pairs=  tar.targetedValue(arr,6);
      System.out.print(pairs);

    }
}
