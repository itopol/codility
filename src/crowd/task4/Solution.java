package crowd.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 11/15/15
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(solution(2099, "April", "December", "w"));
    }


    public static int solution(int Y, String A, String B, String W) {
        int weekCount;
        Month monthFrom = Month.valueOf(A.toUpperCase());
        Month monthTo = Month.valueOf(B.toUpperCase());

        LocalDate localDateFrom = LocalDate.of(Y, monthFrom, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        ;

        LocalDate localDateTo = LocalDate.of(Y, monthTo, 1).with(TemporalAdjusters.lastDayOfMonth())
                .with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));

        weekCount = (int) ChronoUnit.WEEKS.between(localDateFrom, localDateTo.plusDays(1));


        return weekCount;
    }


}
