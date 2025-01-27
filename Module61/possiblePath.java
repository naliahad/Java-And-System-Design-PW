package Module61;

public class possiblePath 
{
    public static void printPaths(int current, int destination, String ans)
    {
        if(current > destination)
        {
            return;
        }

        if(current == destination)
        {
            System.out.println(ans);
            return;
        }

        printPaths(current + 1, destination, ans + 1);
        printPaths(current + 2, destination, ans + 2);
        printPaths(current + 3, destination, ans + 3);
        printPaths(current + 4, destination, ans + 4);
        printPaths(current + 5, destination, ans + 5);
        printPaths(current + 6, destination, ans + 6);
    }
    public static void main(String[] args) 
    {
        printPaths(0, 6 , "");
    }
}
