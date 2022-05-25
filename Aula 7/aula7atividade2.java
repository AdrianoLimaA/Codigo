import java.util.Scanner;

public class aula7atividade2 {
    public static void main(String[] args){
        
    int condicao = 0;
    String frase = "";

    Scanner dados = new Scanner(System.in);

    System.out.println("Digite um nº para mostrar o dia da semana correspondente");
    condicao = dados.nextInt();
    
        switch (condicao){
            case 1:
                frase = "Domingo";
                break;
            case 2:
                 frase = "Segunda-Feira";
                break;
            case 3:
                frase = "Terça-Feira";
                break;
            case 4:
                frase = "Quarta-Feira";
                break;
            case 5:
                frase = "Quinta-Feira";
                break;
            case 6:
                frase = "Sexta-Feira";
                break;
            case 7:
                frase = "Sábado";
                break;
        }
    System.out.println(frase);
    }
}