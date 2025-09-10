package diobootcamp.exerciciosiniciais;

//Escreva um código que receba o nome e a idade de 2 pessoas
// e imprima a diferença de idade entre elas

import java.util.Scanner;

public class ScannerOpCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digita o nome da outra pessoa agora: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digita a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        scanner.close();

    }
}
