package Module24;

public class Pangram 
{
    public static void main(String[] args) 
    {
        // phrase which conntain all the alphabets.
        //the quick brown fox jumps over the lazy dog
        String str = "the quick brown fox jumps over the lazy dog";
        str = str.toUpperCase(); // or convert to lower case
        str = str.replace(" ", "");  
        char ch[] = str.toCharArray();
        //Arrays.sort(ch);
        System.out.println(ch);
        int arr[] = new int[26];
        boolean flag = false;

        for(int i=0; i<ch.length; i++)
        {
            int a = ch[i] - 65;
            arr[a]++;
        }

        for(int j=0; j<arr.length; j++)
        {
            if(arr[j] < 1)
            {
                
                System.out.println("Is a not Pangram.");
                flag = true;
                return;
            }

        }
        
        if(flag == false)
        {
            System.out.println("Is a pangram.");
        }
       
    }
    
}
