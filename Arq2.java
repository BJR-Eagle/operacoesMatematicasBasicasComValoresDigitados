import java.util.Scanner;

public class Arq2 {
    public static void main(String[] args) {

        //Declarar o scanner
        Scanner sc = new Scanner(System.in);

        //Declara as variaves utilizadas como double (decimal)
        double n1,n2,soma,divisao,multiplcacao,subtracao;
        
        //Coleta o valor da variavel n1
        System.out.println("Digite o valor de n1");
        n1 = sc.nextDouble();

        //Coleta o valor da variavel n2
        System.out.println("Digite o valor de n2");
        n2 = sc.nextDouble();

        //Realiza as operacões
       soma = n1 + n2;
       subtracao = n1 - n2;
       multiplcacao = n1 * n2;
       div5 = n1 / n2;

       //Imprime em tela os resultadps das operacões
        System.out.println("A subtração de "+ n1 +" e "+ n2 +"é:"+subtracao);
        System.out.println("A divisão é: "+divisao);
        System.out.println("A soma é: "+soma);
        System.out.println("A multiplicação é: "+multiplcacao); 

    }
}
