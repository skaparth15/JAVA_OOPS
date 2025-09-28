import java.util.HashMap;
import java.util.Map;

public class Highest_subArry {
    public static void main(String args[]){
        int MAX_COUNT=0;
        String name="abccbaaabcda";
        StringBuilder sB=new StringBuilder();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<=name.length()-1;i++){
            char c= Character.toLowerCase(name.charAt(i));
            if(sB.indexOf(String.valueOf(c))==-1) {
                sB.append(c);
            }
            else if(sB.toString().indexOf(name.charAt(i))!=-1){

                 map.put(sB.toString(), sB.length());
                 sB.setLength(0);
                 sB.append(c);
                }


        }
        map.put(sB.toString(), sB.length());

        System.out.println(map.size());

      for (Map.Entry <String,Integer>map1:map.entrySet()){
             if(map1.getValue()>MAX_COUNT){
                 MAX_COUNT= map1.getValue();
             }
        }
      System.out.println(MAX_COUNT);
    }
}
