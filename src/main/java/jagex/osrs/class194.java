package jagex.osrs;

import java.util.Calendar;
import java.util.TimeZone;

public class class194 {

    public static final String[][] field2464;
    public static final String[] field2466;
    public static Calendar field2463;
    static class322[] field2465;

    static {
        field2464 = new String[][]{
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"},
            {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
        field2466 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2463 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
