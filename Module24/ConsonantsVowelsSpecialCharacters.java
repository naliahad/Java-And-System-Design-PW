package Module24;

public class ConsonantsVowelsSpecialCharacters 
{
    
    public static void main(String[] args) 
    {
        String sentence = "The quick brown fox jump's over the lazy dog.";
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int consCount = 0;
        int specialCount = 0; // New counter for special characters

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (vowels.contains(String.valueOf(currentChar))) {
                    vowelCount++;
                } else {
                    consCount++;
                }
            } else {
                specialCount++; // Increment special character count
            }
        }

        System.out.println("Vowels count: " + vowelCount);
        System.out.println("Consonants count: " + consCount);
        System.out.println("Special characters count: " + specialCount); // Display special character count
    }
}