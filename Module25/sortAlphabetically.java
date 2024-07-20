package Module25;

import java.util.Arrays;

public class sortAlphabetically 
{
    //assignment
    public static void main(String[] args) 
    {
        // Original string
        String originalStr = "PW SKILLS";
        char []ch = originalStr.toCharArray();
        Arrays.sort(ch);

        String result = new String(ch);
        System.out.println(result);

    }


}
