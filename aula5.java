class Main {
    public static void main (String[] args){
        // Entrada
        int numero1;
        int numero2;

        int soma;
        int subtracao;
        int divisao = 0;
        int multiplicacao;
        int resto = 0;

        numero1 = 456;
        numero2 = 60;

        // Processamento

        soma = numero1+numero2;
        subtracao = numero1-numero2;
        multiplicacao = numero1*numero2;
        
        if (numero2 == 0){
            System.out.println("Não é possível dividir por 0 ou pegar o resto");
        } else {
            divisao = numero1/numero2;
            resto = numero1%numero2;
        }
             
        
        // Saída
        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + subtracao);
        System.out.println("A divisão  é " + divisao);
        System.out.println("A multiplicação é " + multiplicacao);
        System.out.println("O resto é " + resto);
    }
}
