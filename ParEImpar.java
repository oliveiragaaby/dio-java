package dio;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int par = 0, impar = 0;
        int qntNumeros = 0;

        System.out.println("quantidade de números: ");
        qntNumeros = scan.nextInt();

        for(int i = 0; i < qntNumeros; i++){
            System.out.print("digite um número inteiro: ");
            n = scan.nextInt();

            if(n % 2 == 0)par++;
             else impar++;
        }

        System.out.println("quantidade par: " + par + "\n" + "quantidade ímpar: " + impar);

    }
}
