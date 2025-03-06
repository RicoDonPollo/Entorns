import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

public class ProvaCN {
    public static void main(String[] args) {
        
        String startDate = "10/10/2020";
        String endDate = "15/10/2020";
        String date="31/02/2020";
        String dia="19/02/2025";


        long diferent = daysBetween(startDate,endDate);
        if(diferent != 5){
            System.out.println("NO OK");
        }
        else{
            System.out.println("OK");
        }
        

        boolean correcte = idValidDate(date);

        if (correcte==false) {
            System.out.println("Data no vàlida");
        }
        else{
            System.out.println("Data vàlida");
        }

        // 3
        long dia = dayOfWeek();
        if(15/02/2025!=dijous){
            System.out.println("NO OK");
        }
        else{
            System.out.println("OK");
        }
    }
}
