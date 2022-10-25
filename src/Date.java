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
