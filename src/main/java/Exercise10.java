import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise10 {
    public String findDay(int day, int month, int year) throws ParseException {
        SimpleDateFormat formatDay = new SimpleDateFormat("yyyy MM dd");
        String input = String.format("%s %s %s", year, month, day);
        Date date = formatDay.parse(input);

        return String.format("%tA", date);
    }
}