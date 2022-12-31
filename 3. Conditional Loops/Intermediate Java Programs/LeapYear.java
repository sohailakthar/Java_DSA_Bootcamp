import java.time.Year;

public class LeapYear {
    static boolean checkYear(int year)
    {
    // Return true if year is a multiple
    // of 4 and not multiple of 100.
    // OR year is multiple of 400.
    return (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));
    }
         
    // Driver method
    public static void main(String[] args)
    {
        int year = 2000;
        System.out.println(checkYear(year)? "Leap Year" :
                           "Not a Leap Year" );
    }
}