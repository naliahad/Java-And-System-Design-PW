package Module58;

import java.util.Scanner;

public class power {    
     public static int powerFind(int a, int b){
        int mid; int RigtSideAns; int finalAns;
        //base case condition
        if (b==1) return a;
        mid = b/2;
        RigtSideAns = powerFind(a, mid);
        finalAns = RigtSideAns * RigtSideAns;  
        
        if (b%2 == 0) return finalAns;
        return a * finalAns;
     }

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Eneter the value of a.");
        int a = sc.nextInt();
        System.out.println("Eneter the value of b.");
        int b =  sc.nextInt();

        System.out.println("a^b = " + powerFind(a, b));

    }
}
