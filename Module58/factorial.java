package Module58;

class factorial{
    public static int f(int n){
        if (n == 0) return 1;
        int smallAns = f(n-1);
        return n*smallAns;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(f(n));
        
    }
}