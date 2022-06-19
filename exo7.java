package Evaluation;
import java.util.Arrays;
public class exo7 {
    public static void main(String[] args) {
        String tableauCaractere[]={"a","b","c","d","e","f"};

       for (int i=0;i<tableauCaractere.length-1;i=i+2){
            tableauCaractere[i]=tableauCaractere[i].toUpperCase();
       }
        System.out.println(Arrays.toString(tableauCaractere));

    }
}
