package Module58;

class fibonacci{ //0 1 1 2 3 5 8 13 21
public static int fib(int n){

    if (n ==0 || n==1)  return n;
   
   int ans = fib(n-1) + fib(n -2);
   
   return ans;
}
    public static void main(String[] args) {
        int n = 10;

        for (int i=0; i<= n; i++){
        System.out.println(fib(i));
        }
        
    }
}