import java.util.Scanner;

public class Aventura {
    public static void main(String[] args) {

        Heroi<String> mago = new Heroi<>("Merlin", 100, "Mago");
        Heroi<String> guerreiro = new Heroi<>("Arthur", 35, "Guerreiro");

        mago.atacar();
        guerreiro.atacar();
    }
}
