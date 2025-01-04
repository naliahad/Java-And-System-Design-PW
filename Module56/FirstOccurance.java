    package Module56;
    import java.util.Arrays;

    class demo1
    {
        public static int firstTime(int arr[], int target)
        {
            int low, mid, high, result;

            low = 0;
            high = arr.length;

            result = -1;

            while(low<=high)
            {
                mid =  low + (high-low)/2;

                if(arr[mid] == target)
                {
                    result =mid;
                    high = mid-1;
                }

                else if(arr[mid]>target)
                {
                    high = mid-1;
                }

                else
                {
                    low = mid+1;
                }

            }

            return result;
        }
    }
    public class FirstOccurance 
    {
        public static void main(String[] args) 
        {
            int arr[] = {1,3,5,6,7,8,8,9};
            Arrays.sort(arr);
            int target = 8;
            int result = demo1.firstTime(arr, target);

            if(result!=-1)
            {
                System.out.println("Element found at location: " + result);
            }

            else
            System.out.println("Element not found.");
        }
    }
