public class Date {
    //Variables
    private int day;
    private int month;
    private int year;


    //Gets
    int getDay(){return this.day;}
    int getMonth(){return this.month;}
    int getYear(){return this.year;}


    //Constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    //Métodos
    //Nombre del mes
    String getMonthName(){
        String monthName = "";

        switch (this.month) {
            case 1:
                monthName = "Enero";
                break;

            case 2:
                monthName = "Febrero";
                break;

            case 3:
                monthName = "Marzo";
                break;

            case 4:
                monthName = "Abril";
                break;

            case 5:
                monthName = "Mayo";
                break;

            case 6:
                monthName = "Junio";
                break;

            case 7:
                monthName = "Julio";
                break;

            case 8:
                monthName = "Agosto";
                break;

            case 9:
                monthName = "Septiembre";
                break;

            case 10:
                monthName = "Octubre";
                break;

            case 11:
                monthName = "Noviembre";
                break;

            case 12:
                monthName = "Diciembre";
                break;

            default:
                System.out.println("Introduce un mes válido");
        }
        return monthName;
    }

    //Número de días de un mes
    int getMonthDays(){
        int monthDays = 0;

        switch (this.month) {
            case 1:
                monthDays = 31;
                break;

            case 2:
                monthDays = 28;
                break;

            case 3:
                monthDays = 31;
                break;

            case 4:
                monthDays = 30;
                break;

            case 5:
                monthDays = 31;
                break;

            case 6:
                monthDays = 30;
                break;

            case 7:
                monthDays = 31;
                break;

            case 8:
                monthDays = 31;
                break;

            case 9:
                monthDays = 30;
                break;

            case 10:
                monthDays = 31;
                break;

            case 11:
                monthDays = 30;
                break;

            case 12:
                monthDays = 31;
                break;

            default:
                System.out.println("Introduce un mes válido");
        }
        return monthDays;
    }

    //Días hasta el final del mes
    void getDatesUntilMonthEnd(){
        for(int i = day; i <= this.getMonthDays(); i++){
            System.out.println(i + "/" + month + "/" + year);
        }
    }

    //Saber si es mismo día
    boolean isSameDay(Date another){
        return this.year == another.getYear() && this.month == another.getMonth() && this.day == another.getDay();
    }
}