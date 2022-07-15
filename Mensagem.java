package dio;

public class Mensagem {

    public static void obterHora(int hora){
        if(hora >= 5 && hora <=11){
            mensagemBomDia();
        } else if (hora >= 12 && hora <= 18) {
            mensagemBoaTarde();
        } else {mensagemBoaNoite();}
    }

    public static void mensagemBomDia(){
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa noite!");
    }
}
