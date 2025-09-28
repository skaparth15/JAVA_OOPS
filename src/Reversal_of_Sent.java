public class Reversal_of_Sent {
    public static void main(String [] args){
        String name ="java is powerful language ";
        String[] names=name.split(" ");
        StringBuilder reversed=new StringBuilder();
        for(int i=names.length-1;i>=0;i--){
            reversed.append(names[i]+" ");


        }

        System.out.print(reversed);



    }
}
