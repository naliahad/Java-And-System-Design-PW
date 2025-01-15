package Module58;

class factorial{
    public static int f(int n)
    {
        int result = 0;
        if (n == 0) 
        {
            return 1;
        }
        else
        {
            result = n*f(n-1);
        }
       
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));
        
    }
}