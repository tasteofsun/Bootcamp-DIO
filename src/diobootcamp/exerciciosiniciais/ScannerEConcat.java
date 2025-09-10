package diobootcamp.exerciciosiniciais;

//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
// "Olá 'Fulano' você tem 'X' anos"

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerEConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int ano = LocalDate.now().getYear();

        System.out.println("Primeiro dgite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = ano - anoNascimento;

        System.out.println("Olá " + nome + ", aparentemente você tem " + idade + " anos!");

        scanner.close();

    }
}