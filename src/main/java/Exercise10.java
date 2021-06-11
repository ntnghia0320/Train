import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise10{
    public static String findDay(int day, int month, int year) throws ParseException {
        SimpleDateFormat formatDay = new SimpleDateFormat("yyyy MM dd");
        String input = year + " " + month + " " + day;
        Date date;

            date = formatDay.parse(input);
            String xDay = String.format("%tA", date);

            return xDay;
    }
}