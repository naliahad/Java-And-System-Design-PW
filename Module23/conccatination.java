package Module23;

class conccatination
{
    public static void main(String[] args) 
    {
        String s1 = new String("pw ");
        s1 = s1.concat("skill");

        System.out.println(s1);

        String s3 = "pw ";
        String s4 = "pw " +  "java ";
        String s5 = "pw " + "java " + "skill ";
        String s6  = s3 + s4;
        
        System.out.println(s6);
         
    }
}