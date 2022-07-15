package dio;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("digite uma nota: ");
        nota = scan.nextInt();

            while(nota < 0 | nota > 10){
                System.out.println("nota inválida! digite novamente");
                nota = scan.nextInt();
            }
    }
}
