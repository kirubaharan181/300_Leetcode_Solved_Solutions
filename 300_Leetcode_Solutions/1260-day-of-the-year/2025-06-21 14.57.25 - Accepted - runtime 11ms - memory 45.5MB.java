import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        String[] d=date.split("-");
        int year=Integer.parseInt(d[0]);
        int m=Integer.parseInt(d[1]);
        int day=Integer.parseInt(d[2]);
        LocalDate l=LocalDate.of(year,m,day);
        return l.getDayOfYear();
    }
}