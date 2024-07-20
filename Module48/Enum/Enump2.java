package Module48.Enum;

enum Result
{
    PASS, FAIL, NR;

    //public static final Result PASS =  new Result();
    //public static final Result FAIL =  new Result();
    //public static final Result NR =  new Result();
    int marks;

    Result()
    {
        System.out.println("In Enum constructor.");
    }

    void setMarks(int marks)
    {
        this.marks =  marks;
    }

    int getMarks() 
    {
        return marks;
    }
}

public class Enump2 
{
    public static void main(String[] args) 
    {
        Result.PASS.setMarks(20);
        int res1 = Result.PASS.getMarks();
        System.out.println(res1);
    }    
}
