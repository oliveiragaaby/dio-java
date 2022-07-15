package dio;

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double valor1, double valor2){
        return valor1 * valor2;
    }

    public static double area(double baseMenor, double baseMaior, double altura){
        return (baseMaior + baseMenor) * altura / 2;
    }
}
