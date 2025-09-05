import java.time.*;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        String[] d1=date1.split("-");
        String[] d2=date2.split("-");
        LocalDate l1=LocalDate.of(Integer.parseInt(d1[0]),Integer.parseInt(d1[1]),Integer.parseInt(d1[2]));
        LocalDate l2=LocalDate.of(Integer.parseInt(d2[0]),Integer.parseInt(d2[1]),Integer.parseInt(d2[2]));
        int res=(int)ChronoUnit.DAYS.between(l1,l2);
        return Math.abs(res);
    }
}