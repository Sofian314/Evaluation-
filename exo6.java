package Evaluation;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Donner le nombre de lignes : ");
        var lignes=input.nextInt();
        System.out.print("Donner le nombre de colonnes : ");
        var colonnes=input.nextInt();
        System.out.print("Donner le nombre a chercher : ");
        var nombreAChercher=input.nextInt();
        int compteur=0;

        int[][] matrice=new int[lignes][colonnes];

        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }

        System.out.println("Affichage de tout le tableau");
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }


        for(int i=0;i< matrice.length;i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if(matrice[i][j]==nombreAChercher){
                    compteur=compteur+1;
                }
            }
        }

        if(compteur!=0){
            System.out.print(nombreAChercher+" se retrouve "+compteur+" fois dans les emplacements suivants :");
            System.out.print("[");
            for(int i=0;i< matrice.length;i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    if(matrice[i][j]==nombreAChercher){
                        System.out.print("["+i+","+j+"]");
                    }
                }
            }System.out.print("]");
        }
        if(compteur==0){
            System.out.println(nombreAChercher+" ne se retrouve pas dans le tableau");
        }


        }
    }



