package Module24;

import java.util.Arrays;

public class Anagram 
{
    public static void main(String[] args) 
    {
        // keep > peek same charachters used to create a  new word or phrase
        // School master > The classroom

        String str1 = "School master";
        String str2 = "The classroom";
        str1.replace(" ", "");
        str2.replace(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char ar1[] = str1.toCharArray();
        char ar2[] = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        System.out.println(ar1);
        System.out.println(ar2);

        if (Arrays.equals(ar1,ar2))
        {
            System.out.println("Is a anagram.");
        }
        else{
            System.out.println("Is not a anagram.");
        }
    }
}
