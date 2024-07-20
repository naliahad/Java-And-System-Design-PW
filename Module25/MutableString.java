package Module25;

public class MutableString 
{
    public static void main(String[] args) 
    {
        //StringBuffer, StringBuilder

        StringBuilder sb = new StringBuilder("Virat");
        System.out.println(sb);
        sb.append(" Kholi"); //new object is not created here
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Virat");
        System.out.println(sb1);
        sb1.append(" Kholi"); //new ovject is not created here
        System.out.println(sb1);
    }
}
