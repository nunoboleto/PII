package piggy;

import java.util.ArrayList;
import java.util.Arrays;

class Piggy{


    String sym;
    int value;
    ArrayList<String> bandas = new ArrayList<String> ();

    
    // Construtor
    Piggy(String sym, int value){

            this.sym = sym;
            this.value = value;
    }

    addPiggy(ArrayList bandas){
        bandas.add(Piggy);

    }


    public String toString(){

            String msg = "";
            msg = (sym + value);
            return(msg);
    }

    public static void main (String[] arg){
            Piggy c1 = new Piggy("€", 5);
            System.out.println(c1.toString());
    }
}
