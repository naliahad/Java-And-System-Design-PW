package Module25;

public class Assignment
{
    public static void main(String[] args)
    {
        // Original string
        String originalStr = "PW SKILLS";
// Initialize StringBuilder for better performance
        StringBuilder result = new StringBuilder();
       
        // Split the reversed string into words
        String[] words = originalStr.split(" ");
       
        // Reverse each word to its original position
        for (String word : words)
        {
            // Reverse each word and append it to the result
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }


        // Trim the last space and print the final result
        System.out.println(result.toString().trim());
    }
}

