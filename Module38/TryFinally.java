package Module38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFinally {
    
    public static void main(String [] args){
       int Name = 0;
    //    Scanner sc = new Scanner(System.in);
      
    //    try{ 
    //     Name = sc.nextInt();
        
    //     }
    //     catch(InputMismatchException e){
        
    //         System.out.println("incorrect error" + e);
            
    //     }

    //     finally // will always be executed no matter if exception is t or  not.
    //     {
    //         sc.close();
    //     }

    try (Scanner sc = new Scanner(System.in))  // try with resources, will close try block without finally.-

    {
        Name  = sc.nextInt();
        System.out.println("closed");
    }
       System.out.println(Name);
    }
}
