package Module35;
@FunctionalInterface //// Lmbda only works with only one mehtod. (@FunctionalInterFace) will make sure there is only one method otherwise will through an error.
interface Car
{
    void drive(int topSpeed); //
}
public class LambdaExpression 
{

        /*
         Functional interface = (parameter - list) -> {body}
         1. Argument-list = empty/non-empty.
         2. Arrow-Token = used to link arguments-list and body of expression.
         3. Body = contains expression and statements for lambda expression.
        */      

    public static void main(String[] args) 
    {   
        Car obj = (ts) -> System.out.println("Driving....");
            
        obj.drive(200);
    }
}
