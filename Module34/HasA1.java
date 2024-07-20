package Module34;
//Injecting one dependent object to the target class is called as dependency injection. 1. Constructor injection. 2. Setter Injection.  
class Employee
{
    private Address adr;
    public void setAddress(Address adr)
    {
        this.adr = adr;
    }

    public void getAddress()
    {
        adr.addr();
    }
}
class Address
{
    public void addr()
    {
        System.out.println("Address is Bengaluru.");
    }
}

class HasA1
{
    public static void main(String[] args) 
    {
        Address a  =  new Address();
        Employee e = new Employee();

        e.setAddress(a);
        e.getAddress();

    }
}