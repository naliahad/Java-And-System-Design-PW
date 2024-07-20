package Module48.DateAndTime;

import java.time.*; /// time package inside java

 class timePackage 
{
    public static void main(String[] args) 
    {

        
        LocalDate date  =  LocalDate.now();
        System.out.println(date);

        System.out.println("------------------------");

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "-" + month + "-" + year);
        System.out.println("--------------------------");

         LocalTime time= LocalTime.now();

        System.out.println(time);

        System.out.println("----------------------------");

       int hour = time.getHour();
       int min = time.getMinute();
       int second = time.getSecond();
       int NanoSecond = time.getNano();

       System.out.println(hour+":"+ min+":"+second+":"+NanoSecond);


    }
 }