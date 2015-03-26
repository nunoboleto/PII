
package pig;

import java.util.Arrays;
import java.util.Scanner;

public class Pig {

    int[] value;
    int money;
    int nMoney;
    String currencyType;
    int bill;

    Pig(int nMoney) {
       this.value = new int[nMoney];
       this.nMoney = nMoney;
       this.money = money;
       this.currencyType = currencyType;
       this.bill = bill;
    }

    void typeCurrency(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Digite o simolo");
        currencyType = entry.next();
    }

    void makeMoney(){
        Scanner entry = new Scanner(System.in);

        while (nMoney > 0){
           System.out.println("Digite o valor nº" + nMoney);
           nMoney --;
           money = entry.nextInt();
           addValue();
        }
    }

    void addValue(){
        this.value[nMoney] = money;
        makeMoney();

    }

    void removeValue(int bill){

        for(int i = value.length - 1; i >= 0; i--){
            if(value[i] == bill ){
                value[i] = 0;
            }

        }
    }

    void calc(){
        int calc = 0;
        int number = 0;
        for(int i = value.length - 1; i >= 0; i--){
            calc = value[i];
            number += calc;
        }
        System.out.println("Tem no seu porquinho" + number + currencyType);
    }


    void printArray(){
        System.out.println("Valores Inseridos" + Arrays.toString(value));

    }

    public static void main(String[] args) {
        int syze;
        Scanner entry = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu Piggy");
        syze = entry.nextInt();

        Pig c1 = new Pig(syze);

        c1.typeCurrency();

        String choise = "";
        while(!"s".equals(choise)){
            Scanner x = new Scanner(System.in);
            System.out.println("Inserir Valores -> I || Remover Valor -> R || Calcular Valor -> C || Sair -> S");
            choise = x.next();

            if("i".equals(choise)){
                c1.makeMoney();
                c1.printArray();
            }
            if("c".equals(choise)){
                c1.calc();
            }

            if("r".equals(choise)){
                Scanner y = new Scanner(System.in);
                System.out.println("Valor a remover??  ");
                int removeMoney = y.nextInt();
                c1.removeValue(removeMoney);
            }


       }
    }

}
