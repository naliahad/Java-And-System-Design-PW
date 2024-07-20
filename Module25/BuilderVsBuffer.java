package Module25;

public class BuilderVsBuffer {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb.capacity()); // 16 memory are allocated by default for both buffer and builder.
        System.out.println(sb1.capacity());
        sb.append("abcdjhagsdbnkslu");
        System.out.println(sb.capacity());

        StringBuffer ns = new StringBuffer("java"); // this will allocate 16 + size of value.
        System.out.println("ns capacity " + ns.capacity());

        sb.append("a"); // if we want to increase capacity it will be increased by (16+1)*2= 34
        System.out.println(sb.capacity());
        System.out.println(  sb.length()); // lenght will remain equal to value's stored.

        StringBuffer sb2 = new StringBuffer(50); // will define capacity manually
        System.out.println(sb2.capacity());
        sb2.append("java");
        System.out.println(sb2);
        sb2.trimToSize(); // to decrese the capacity.
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer();
        sb3.append("pwjava");
        System.out.println(sb3.reverse()); //reveres method

    }

}
