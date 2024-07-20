package Module24;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        str1 = str1.toUpperCase();
        str1 = str1.replace(" ", "");
        char[] ch = str1.toCharArray();
        int[] arr = new int[26];

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < ch.length; i++) {
            int index = ch[i] - 65;
            arr[index]++;
            if (arr[index] > maxCount) {
                maxCount = arr[index];
                maxChar = ch[i];
            }
            System.out.println("Maximum occurring character: " + maxChar);
        }

        
        System.out.println("Count: " + maxCount);
    }
}
