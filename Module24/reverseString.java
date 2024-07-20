package Module24;

public class reverseString 
{
    public static void main(String[] args) 
    {
       // pw java = avaj wp
          String str1 = "pwskill java";
          String str2 = "";
          String str3 = "";
          String str4 = "";
        {
          for (int i = str1.length()-1; i >=0;i--)
          {
            str2 = str2 + str1.charAt(i);
            System.out.print(str1.charAt(i));
          } 

          //System.out.println(str2);

        }
          // pwskill java  =  java pwskill
        {
          String [] arr = str2.split(" ");

          for(int i = arr.length-1; i>= 0; i--)
          {
            str3 = str3 + arr[i] + " ";
          }

          //System.out.println(str3 );

        }
          //pwskill java  = avaj llikswp ->  add above to codes
        {

          String []arr =  str1.split(" ");
          for (String ele : arr) 
          {
             for(int i = ele.length() -1; i>=0; i--)
             {
              str4 = str4 + ele.charAt(i);
             } 

             str4 = str4 + " ";
          }
          System.out.println(str4);
        }
      }
  }