package data;

public class Data {

    int day;
    int month;
    int year;

    Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void CalcBix(){
        if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
            System.out.println("É bisexto");

        }else{
            System.out.println("Não é bisexto");
        }
    }

    public void nextDay(){
        if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10:
                    if(day == 31){
                        day = 1;
                        month ++;
                    }
                case 2:
                    if(day == 29){
                        day = 1;
                        month = 3;
                    }
                case 12:
                    if(day == 31){
                        day = 1;
                        month = 1;
                        year ++;
                    }
            }
        }else{
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10:
                    if(day == 31){
                        day = 1;
                        month ++;
                    }
                case 2:
                    if(day == 28){
                        day = 1;
                        month = 3;
                    }
                case 12:
                    if(day == 31){
                        day = 1;
                        month = 1;
                        year ++;
                    }
            }
        }
    }

    public void printDate(){
        System.out.println(day + "-" + month + "-" + year);
    }

    public static void main(String[] args) {
        Data d = new Data(29,2,2036);
        d.CalcBix();
        d.nextDay();
        d.printDate();

    }

}
