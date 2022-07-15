package dio;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contagem = 0;
        int soma = 0;
        int maior = 0;
        int numero;
        double media;

        do{
            System.out.print("digite um número: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            soma += numero;
            contagem++;

        }while (contagem < 5);

        media = soma / contagem;
        System.out.println("médida: " + media);
        System.out.println("maior número: " + maior);
        System.out.println("contagem: " + contagem);
    }
}
