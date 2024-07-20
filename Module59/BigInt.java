package Module59;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {    
     public static BigInteger powerFind(BigInteger a, int b){
        BigInteger mid, RigtSideAns, finalAns;
        //base case condition
        if (b==1) return a;
        
        RigtSideAns = powerFind(a, b/2);
        finalAns = RigtSideAns.multiply(RigtSideAns);  
        
        if (b%2 == 0) return finalAns;
        return a.multiply(finalAns);
     }

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Eneter the value of a.");
        BigInteger a = sc.nextBigInteger();
        System.out.println("Eneter the value of b.");
        int b =  sc.nextInt();

        System.out.println("a^b = " + powerFind(a, b));

    }
}