package Module48.Enum;

enum Week
{
    //BY default -> public static final -> dosent change
    Mon,TUE, WED, THU, FRI, SAT, SUN; //Variable name and both value same.
}
public class Enump1 
{

    enum Result // can also be defined inside class
    {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) 
    {
        /* When-ever we have pre defined set of group of constant. Ex Monday Tuesday etc, January Feb etc, Male Female etc */
        Week s = Week.SUN;
       System.out.println(s);

       Result p = Result.PASS;
       System.out.println(p);

       int index =Week.SUN.ordinal(); // will give index.
       System.out.println(index );
    
       Week [] val =Week.values(); //will give values.
       
        for(Week w:val)
        {
            System.out.println(w + ":" + w.ordinal());
        }


    }
}
