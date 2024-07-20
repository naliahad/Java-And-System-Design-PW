package Module48.DateAndTime;
import java.util.Date;

public class date 
{
    public static void main(String[] args) 
    {
        Date date  = new Date(); // for java
        System.out.println(date);

        long timeInMs  = date.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMs); //for data base 
        System.out.println(dt1);
    }
}
