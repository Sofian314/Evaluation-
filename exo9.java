package Evaluation;

public class exo9 {
    public static void main(String[] args) {
        String chaine="chatte";
        //System.out.println(chaine.charAt(1));
        //System.out.println(chaine.length());


        int s=0;
        char lettreTest=chaine.charAt(0);
        for(int i=1;i<chaine.length()-1;i++){
            if(lettreTest==chaine.charAt(i)){
                System.out.print("true");
                break;
            }else {
                lettreTest=chaine.charAt(i);
            }
        }
        for(int i=1;i<chaine.length()-1;i++){
            if(lettreTest!=chaine.charAt(i)){
                System.out.print("false");
                break;
            }else {
                lettreTest=chaine.charAt(i);
            }
        }



        //if(s==1){
        //    System.out.print("true");
        //} else if (s==2) {
        //    System.out.println("false");
        //}



    }
}
