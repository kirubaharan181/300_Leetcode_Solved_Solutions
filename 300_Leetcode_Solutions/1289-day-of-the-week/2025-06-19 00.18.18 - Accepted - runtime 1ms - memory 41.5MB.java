import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate d = LocalDate.of(year, month, day);
        DayOfWeek dow = d.getDayOfWeek();
        String c=dow.toString();
        String res=c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase();
        return res;
    }
}