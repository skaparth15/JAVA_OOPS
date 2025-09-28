public class stringExample {

    public static void main(String args[]) {
        String name1="charan";
        Boolean ispalindropme=true;

        String reverse= ReverseOfstring(name1);
        if(!reverse.equals(name1)){
            ispalindropme=false;
            System.out.print(ispalindropme);
        }
        else {
            System.out.print(ispalindropme);
        }
    }

    public static String ReverseOfstring(String name) {
        String res ="";
        for (int i = name.length()-1; i>=0; i--) {

            res= res+name.charAt(i);

        }
 return res;
    }
}