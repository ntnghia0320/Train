import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise10{
    public static String findDay(int day, int month, int year) {
        SimpleDateFormat formatDay = new SimpleDateFormat("yyyy MM dd");
        String input = year + " " + month + " " + day;
        Date date;

        try {
            date = formatDay.parse(input);
            String xDay = String.format("%tA", date);

            return xDay;
        } catch (ParseException e) {

            return "Not Found";
        }
    }
}