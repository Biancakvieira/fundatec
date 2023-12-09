import java.util.Scanner;
public class Exercicio1 {


    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Digite o valor A: ");
    float valorA = teclado.nextFloat();

    System.out.println("Digite o valor B: ");
    float valorB = teclado.nextFloat();

    float soma = valorA + valorB;
    float subtracao = valorA - valorB;
    float multiplicacao = valorA * valorB;
    float divisao = valorA / valorB;
    float resto = valorA % valorB;

    System.out.println("a) soma = " + soma);
    System.out.println("b) subtracao = " + subtracao);
    System.out.println("c) multiplicacao = " + multiplicacao);
    System.out.println("d) divisao = " + divisao);
    System.out.println("a) resto = " + resto);

    teclado.close();



    }
}