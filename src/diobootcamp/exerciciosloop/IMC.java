package diobootcamp.exerciciosloop;

// Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

import java.util.Scanner;

// Se for menor ou igual a 18,5 "Abaixo do peso";
// se for entre 18,6 e 24,9 "Peso ideal";
// Se for entre 25,0 e 29,9 "Levemente acima do peso";
// Se for entre 30,0 e 34,9 "Obesidade Grau I";
// Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
// Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Digite sua altura (ex: 1,74): ");
        float altura = scanner.nextFloat();

        System.out.println("Agora seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal.");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa).");
        } else {
            System.out.println("Obesidade Grau III (Mórbida).");
        }
    scanner.close();
}
}