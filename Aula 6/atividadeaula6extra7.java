public class atividadeaula6extra7 {
    public static void main(String[] args) {
        String media = "0";
        int nota = 4 ;
        int nota2 = 0 ; 
        int nota3 = 9 ;
        int nota4 = 9 ;

        if ((nota+nota2+nota3+nota4)/4 > 6){
            media = Integer.toString ((nota+nota2+nota3+nota4)/4);
            media = "A sua média foi "+media;
        }
        else 
            media = "A sua média foi " + Integer.toString((nota+nota2+nota3+nota4)/4) + " E vc está expulso";

        System.out.printf("%s" ,media);
    }
}
