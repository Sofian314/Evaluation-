package Evaluation;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Donner la taille du tableau : ");
        var tableau=input.nextInt();

        int[] T=new int[tableau];
        System.out.println("\nRemplir le tableau T");

        for (int i=0; i<=tableau-1; i++){
            System.out.print("T["+i+"]=");
            T[i]=input.nextInt();
        }

        System.out.print("\nT=[");
        for (int i=0; i<=tableau-1; i++){
            System.out.print(" "+T[i]+" ");
        }
        System.out.print("]");

        var PG=T[0];

        var PP=T[0];

        for (int i=0; i<=tableau-1;i++){
                if (PG<=T[i]){
                    PG=T[i];
                }
                if (PP>=T[i]){
                    PP=T[i];
                }

        }



        System.out.println("\nPlus grand : "+PG);
        System.out.println("\nPlus petit : "+PP);

    }
}
