package Evaluation;

public class exo8 {
    public static void main(String[] args) {
        String tableauCaractere[]={"haut","haut","bas","gauche","gauche","droite","haut"};

        int xPositif=0;

        int yPositif=0;

        int xNegatif=0;

        int yNegatif=0;


        for(int i=0; i<tableauCaractere.length;i++){
            if(tableauCaractere[i]=="haut"){
                yPositif=yPositif+1;
            }else if (tableauCaractere[i]=="bas"){
                yNegatif=yNegatif+1;
            } else if (tableauCaractere[i]=="droite") {
                xPositif=xPositif+1;
            } else if (tableauCaractere[i]=="gauche") {
                xNegatif=xNegatif+1;
            }

        }
        int x=xPositif-xNegatif;
        int y=yPositif-yNegatif;
        System.out.println("["+x+","+y+"]");
    }
}
