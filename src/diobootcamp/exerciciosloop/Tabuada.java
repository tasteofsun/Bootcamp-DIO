package diobootcamp.exerciciosloop;

import java.util.Scanner;

// Escreva um código onde o usuário entra com um número
// e seja gerada a tabuada de 1 até 10 desse número;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        //captura o número digitado
        int numero = scanner.nextInt();

        System.out.println("A tabuada de: " + numero + " de 1 ao 10 é: ");

        //gera a tabuada de 1 a 10.
        //“Começa no 1, vai rodando até chegar no 10, e a cada volta soma 1.”
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}