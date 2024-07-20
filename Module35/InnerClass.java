package Module35;

class A 
{
    public void show()
    {
        System.out.println("In A show.");
    }

    class B
    {
        public void display()
        {
            System.out.println("In B display.");
        }
    }
}
       
class InnerClass
{
    public static void main(String[]args)
    {
        A obj = new A();
        obj.show();

        /*  
        B obj1 = new B();
        obj1.display(); objects for innner class cannot be accesed directly, need to mention "class B" belongs to "class A". using "."
        */
        A.B obj1 = obj.new B(); 
        obj1.display();

        /*  
        A.B indicates "class B" belongs to "class A". "obj.new" indicates "obj1 object" belongs to "obj object".
        if not static need to be used object of A (outer class)
       */

        //A.B obj1 = new A.B(); If inner class is static class A is need to be used.                        
    }

}
      
    

 