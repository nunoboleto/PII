package dado;
import java.util.Random;

public class Dado {

    int numero;

    public void rodarDado(){

        Random gerador = new Random();
        numero = gerador.nextInt(6) + 1;

    }

    public void imprimeResultado(){
        
        System.out.println(numero);

    }

    public static void main(String[] args) {

        Dado Jog = new Dado();
        Jog.rodarDado();
        Jog.imprimeResultado();

    }

}
