public class ShiftingToKSteps {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,7};
        int arr1[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[(i+3)%arr.length]=arr[i];
        }
        if(arr.length== arr1.length){
            for(int i :arr1){
                System.out.print(i);
            }
        }
    }
}
