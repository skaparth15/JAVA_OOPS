public class FindElement {
    public static void main(String args[]){
        int arr[]={2,1,9,6,9,8};
        int temp;
        int j;
        for(int i=0;i< arr.length-2;i++){

            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;


            }

        }
        for(int i :arr){
            System.out.print(i);

        }
    }
}
