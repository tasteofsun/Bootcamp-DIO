package diobootcamp.exerciciosloop;

// Escreva um código que o usuário entre com um primeiro número,
// um segundo número maior que o primeiro e escolhe entre a opção
// par e impar, com isso o código deve informar todos os números
// pares ou ímpares (de acordo com a seleção inicial) no intervalo
// de números informados, incluindo os números informados e em
// ordem decrescente;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Agora digite um número mais alto: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Escolha entre números pares ou ímpares: (digite 'par' ou 'impar'): ");
        String escolhaFinal = scanner.next();

        System.out.println(("\nNúmeros " + escolhaFinal + "s entre " + numero + " e " + segundoNumero + " (ordem decrescente):"));

        for (int i = segundoNumero; i >= numero; i--) {
            if (escolhaFinal.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolhaFinal.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}