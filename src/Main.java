public class Main {
    public static void main(String[] args) {

        //Declaración de fechas
        Date hoy = new Date(25, 10, 2022);
        Date ayer = new Date(24, 10, 2022);

        //Uso
        System.out.println(hoy.isSameDay(ayer));

        System.out.println(hoy.getMonthName());

        System.out.println(hoy.getMonthDays());

        hoy.getDatesUntilMonthEnd();
    }
}