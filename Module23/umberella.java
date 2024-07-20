package Module23;

public class umberella 
{
    public static void main(String[] args) 
    {
        char ch;
        String str = "Hello, have a great day.";
        // str = str.toLowerCase();
        // String str1 =str.replaceAll("[bcdfghjklmnpqrstvxyz]", "");
        // System.out.println(str1);

        for (int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) != 'e')
            {
               str = str.replaceAll("[str.charAt(i)]", "");
            }
        }
        
        System.out.println(str);
    }
    
}
