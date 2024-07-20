package Module48.Enum;

enum Result
{
    PASS, FAIL, NR;
}
public class SwitchWithEnum 
{
    public static void main(String[] args) 
    {
        Result res =  Result.PASS;

        switch(res)
        {
            case PASS: System.out.println("PASS");
            break;

            case FAIL: System.out.println("FAIL");
            break;

            case NR: System.out.println("NR");
            break;
        }
    }    
}
