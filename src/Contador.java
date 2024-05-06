import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");

        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");

        int parametroDois = terminal.nextInt();

        if (parametroDois > parametroUm) {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } else  {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }

    static void contar( int parametroUm, int parametroDois )  {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++)
            System.out.println("Imprimindo o número" + " " + i);


    }
    //realizar o for para imprimir os números com base na variável contagem
}

