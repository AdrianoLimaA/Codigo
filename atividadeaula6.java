public class atividadeaula6 {
    public static void main(String[] args){
        
        int notaBimestre1 = 1;
        int notaBimestre2 = 2;
        int notaBimestre3 = 3;
        int notaBimestre4 = 2;
        int mediaAnual = (notaBimestre1 + notaBimestre2 + notaBimestre3 + notaBimestre4) / 4;
        String frase = "";
        
        if (mediaAnual < 4){
            frase = "O aluno foi REPROVADO, pois a média anual foi menor 4 !";
        }
        if (mediaAnual >= 4 && mediaAnual < 7){
            frase = "O aluno está de RECUPERAÇÃO, pois a média anual foi entre 4 e 6 !";
        }
        if (mediaAnual >= 7){
            frase = "Parabéns o aluno foi APROVADO e passou de ano, pois a média anual foi entre 7 e 10 !";
        }
        System.out.println("A médio anual do aluno foi " + mediaAnual);
        System.out.println(frase);        
    }
}
