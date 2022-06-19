package Evaluation;

import java.util.Arrays;
import java.util.Scanner;

class creerFonction {

    static boolean areAnagram(char[] str1, char[] str2) {

        int n1 = str1.length;
        int n2 = str2.length;


        if (n1 != n2)
            return false;


        Arrays.sort(str1);
        Arrays.sort(str2);


        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String args[]) {

        var input=new Scanner(System.in);
        System.out.print("Chaine 1 : ");
        var chaine1=input.next();

        System.out.print("Chaine 2 : ");
        var chaine2=input.next();

        char str1[] = chaine1.toCharArray();;
        char str2[] = chaine2.toCharArray();


        if (areAnagram(str1, str2))
            System.out.println("Ces deux mots sont "
                    + " des anagrammes");
        else
            System.out.println("Ces deux mots ne sont pas"
                    + " des anagrammes");
    }
}