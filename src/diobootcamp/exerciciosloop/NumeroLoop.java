package diobootcamp.exerciciosloop;

// Escreva um código onde o usuário informa um número inicial,
// posteriormente irá informar outros N números, a execução do
// código irá continuar até que o número informado dividido pelo
// primeiro número tenha resto diferente de 0 na divisão, números
// menores que o primeiro número devem ser ignorados

import java.util.Scanner;

public class NumeroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        // Enquanto for verdade (sempre), fica pedindo número atrás de número
        // Só vai parar quando mandar um break lá dentro
        while (true) {
            System.out.println("Digite outro número: ");
            int numero = scanner.nextInt();

            // Ignora se for menor que o inicial
            if (numero < numeroInicial) {
                System.out.println("Número menor que o inicial, ignorado!");
                continue; // volta pro começo do while
            }

            // Verifica se a divisão tem resto
            if (numero % numeroInicial != 0) {
                System.out.println("Divisão não é exata. Programa encerrado.");
                break;
            } else {
                System.out.println(numero + " é divisível por: " + numeroInicial);
            }
        }
        scanner.close();
    }
}
