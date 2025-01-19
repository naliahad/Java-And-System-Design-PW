package Module60;

import java.util.Scanner;

public class alternateSumSign 
{
    public static int altSum(int num)
        {
            int result;

            if(num == 0) return 0;
            else 
            {
                if(num%2 ==1)
                {
                    result = altSum(num-1)+num;
                }
                else
                {
                    result = altSum(num-1)-num;
                }
            }

            return result;
        }
    public static void main(String[] args) 
    {
        
        /*
            input num = 5;
            1-2+3-4+5 = 3;
            output = 3;
        */   

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value.");
        int num =  sc.nextInt();

        int result =  altSum(num);
        System.out.println();
        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
    
}
