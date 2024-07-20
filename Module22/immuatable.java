package Module22;

public class immuatable 
{
    public static void main(String[] args) 
    {
        //String constant pool inside heap, duplicates no allowed will refer to same.
        String s1 = "pw";
        String s2 = "pw";
        System.out.println(s1 == s2);    

        //will be created inside heap area duplicates allowed.
        String s3 =  new String("Skill");
        String s4 =  new String("Skill");
        System.out.println(s3 == s4);
    }
    
}
