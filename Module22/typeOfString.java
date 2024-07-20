package Module22;

public class typeOfString {
    public static void main(String[] args) 
    {

        //immutable String.

        String brand = "pw ";
        System.out.println(brand);
        brand.concat("Skills");
        System.out.println(brand);

        System.out.println("************************");

        //Mutable String
        
        StringBuilder brand1 = new StringBuilder("pw ");
        System.out.println(brand1);
        brand1.append("Skills");
        System.out.println(brand1);
    }
}
