package Module58;

import java.util.Scanner;

public class count_stairs {

    public static int stairsCount(int n){
        if(n <=1) return n;

        return stairsCount(n-1) + stairsCount(n-2);

    }
    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        System.out.println("Enter number of stairs."); 
        int n = sc.nextInt();
    
            System.out.print(stairsCount(n+1));
        
    }
}
