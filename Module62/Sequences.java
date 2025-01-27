package Module62;

import java.util.*;


public class Sequences 
{
    public static void printsubsequences(int [] arr, int index, ArrayList<Integer> tempArr)
    {
        //base case
        if(index  == arr.length)
        {
            //print all the sequences -> but do not print empty entries
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }

            return;
        }

        //Recursive call
        
        //include
        printsubsequences(arr, index+1, tempArr);
        //add the value  in the temp
        tempArr.add(arr[index]);


        //do not include
        printsubsequences(arr, index+1, tempArr);
        //remove the value in tempArr --backtracking
        tempArr.remove(tempArr.size()-1);

    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2};
        System.out.println("For array -> " + Arrays.toString(arr));

        printsubsequences(arr, 0, new ArrayList<Integer>());
        
    }    
}
