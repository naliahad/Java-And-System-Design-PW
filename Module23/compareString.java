package Module23;

public class compareString 
{
    public static void main(String[] args) 
    {
        String s1 =  "pw skill";
        String s2  = new String ("pw skill");

        System.out.println(s1 == s2); // compare the reference 
        System.out.println(s1.equals(s2)); //compare the content

        String s3  = new String ("pw skill");
        String s4  = new String ("PW SKILL");

        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
