package Module60;

import java.util.Scanner;

public class digitSum 
{
    public static int digiSum(int num)
    {
        int result;

        if(num ==0) return 0;

        else
        {
            if(num<0) 
            {
                System.out.println("Enter a positive integer.");
                return 0;
            }
            else result  = num%10 + digiSum(num/10);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        /*
            input = 123;
            1+2+3 = 6;
            output = 6;
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int num =  sc.nextInt();

        int result = digiSum(num);
        System.out.println(result);


    }
}
