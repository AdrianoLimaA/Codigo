public class atividadeaula5 
{
    public static void main(String[] args) 
    {
        //Entrada
        int numerador = 5;
        int denominador = 2;
        int resto = 0;
        String frase = "";

        //Processamento
        resto = numerador%denominador;

        //Saída
        if (!(resto == 0)){
            frase = numerador + " é ímpar";
        } else {
            frase = numerador + " é par";
            
            if (numerador > 10){
                frase += " é maior do que 10";
            }
            if (numerador < 10){
                frase += " é menor do que 10";
            }
            if (numerador == 10){
                frase += " é igual a 10";
            }
        }
        System.out.println(frase);     
    }
}
  
