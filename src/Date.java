public class Date {
    //Variables
    private int day;
    private int month;
    private int year;


    //Gets
    int getDay(){
        return this.day;
    }
    int getMonth(){
        return this.month;
    }
    int getYear(){
        return this.year;
    }

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


    //Constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    //Métodos
    public boolean isSameDay(Date another){
        return this.day == another.getDay();
    }

    public boolean isSameMonth(Date another){
        return this.month == another.getMonth();
    }

    public boolean isSameYear(Date another){
        return this.year == another.getYear();
    }
}


