package dio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nTab;
        System.out.println("digite o número da tabuada: ");
        nTab = scan.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(nTab + " X " + i + " = " + nTab*i);
        }
    }
}
