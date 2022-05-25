
import java.util.Scanner;

public class aula7atividade1 {
    public static void main(String[] args){
        
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double media = 0;
        String frase = "";
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a Nota 1");
        nota1 = Integer.parseInt(dados.nextLine());

        System.out.println("Digite a Nota 2");
        nota2 = Integer.parseInt(dados.nextLine());

        System.out.println("Digite a Nota 3");
        nota3 = Integer.parseInt(dados.nextLine());

        media = (nota1 + nota2 + nota3) / 3;

        if (media < 4){
            frase = "O aluno foi REPROVADO, pois a média foi menor 4 !";
        }
        if (media >= 4 && media < 7){
            frase = "O aluno está de RECUPERAÇÃO, pois a média foi entre 4 e 6 !";
        }
        if (media >= 7){
            frase = "Parabéns o aluno foi APROVADO e passou de ano, pois a média foi entre 7 e 10 !";
        }

        System.out.printf("A média do aluno foi %.2f ", + media);

        System.out.printf(frase);
    }
}