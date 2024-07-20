package Module23;

public class inBuiltMethodString 
{
    public static void main(String[] args) 
    {
        String str =  "pw skills java";

        String str1 = str.toUpperCase();
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.substring(3, 9));
        System.out.println(str1.indexOf("W"));
    }
}
