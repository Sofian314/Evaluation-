package Evaluation;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Chaine 1 : ");
        var chaine=input.nextLine();



        String[] chaine1=chaine.split(" ");


        for (String mot : chaine1){
            String firstLtr = mot.substring(0, 1);
            String restLtrs = mot.substring(1, mot.length());

            String premiereLettre= firstLtr.toUpperCase();
            //String str = premiereLettre + restLtrs;
            System.out.print(premiereLettre+restLtrs+" ");
        }



        }
    }

