package Module61;

public class BalancedBracket 
{
    public static void printCombination(int n, int oc, int cc, String ans)
    {
        if(oc==n && cc ==n)
        {
            System.out.println(ans);
            return;
        }

        if(oc<n)
        {
            printCombination(n, oc+1, cc, ans + '(');
        }

        if(oc>cc)
        {
            printCombination(n, oc, cc + 1, ans + ')');
        }
    }
    public static void main(String[] args) 
    {
        printCombination(3, 0, 0, "");
    }
}
