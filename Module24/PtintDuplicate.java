package Module24;

class PtintDuplicate 
{
    public static void main(String[] args) 
    {
        String str = "The quick brown fox jumps over the lazy dog.";
        str = str.toUpperCase();
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();
        System.out.println(ch);
        int[] arr = new int[26]; // Assuming only uppercase letters

        System.out.println();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                int a = ch[i] - 65; // Calculate index for uppercase letters
                arr[a]++;
            }   
        }

        for (int j = 0; j < ch.length; j++) {
            if (arr[j] > 1) {
                char duplicateChar = (char) (j + 65); // Convert index back to character
                System.out.println("Duplicate character: " + duplicateChar);
            }
        }
    }
}
