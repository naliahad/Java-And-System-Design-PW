package Module21;

class calc
{
    public  int add(int nums[])
    {
        int result = 0;

        for(int n: nums)
        {
            result = result + n;
            
        }
        return result;
    }
}
class AnnonymousArray
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        //int nums[] = ;
        int result  = obj.add(new int[]{5,2,5,3}); //annonymous array w/o name.
        System.out.println(result);

    }
}