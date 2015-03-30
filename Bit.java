package bit;

public class Bit {

    int bit1;
    int bit2;
    int result;

    Bit(int bit1, int bit2){
        this.bit1 = bit1;
        this.bit2 = bit2;
    }

    public int setBit1(int bitis1){
        this.bit1 = bitis1;
        return bit1;
    }

    public int setBit2(int bitis2){
        this.bit2 = bitis2;
        return bit2;
    }


    public void andOperation(){
        if(bit1 == 0 && bit2 == 0){
            result = 0;
        }
        else if(bit1 == 0 && bit2 == 1){
            result = 0;
        }
        else if(bit1 == 1 && bit2 == 0){
            result = 0;
        }
        else if(bit1 == 1 && bit2 == 1){
            result = 1;
        }
    }

    public void orOperation(){
        if(bit1 == 0 && bit2 == 0){
            result = 0;
        }
        else if(bit1 == 0 && bit2 == 1){
            result = 1;
        }
        else if(bit1 == 1 && bit2 == 0){
            result = 1;
        }
        else if(bit1 == 1 && bit2 == 1){
            result = 1;
        }
    }

    public void printBit(){
        System.out.println(result);
    }


    public static void main(String[] args) {
        Bit b = new Bit(1,1);

        b.andOperation();
        b.printBit();

        b.orOperation();
        b.printBit();

    }

}
