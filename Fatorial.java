package dio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int multiplicacao = 1;
        System.out.println("fatorial: ");
        fatorial = scan.nextInt();

        for(int i = fatorial; i > 0; i--){
            multiplicacao*= i;
        }
        System.out.println("fatorial de " + fatorial + ": " + multiplicacao);
    }
}
