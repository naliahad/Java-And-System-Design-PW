package Module25;

public class finalVSimmutable {
    public static void main(String[] args) {
        int a  = 10;
        a = 20;
        System.out.println(a); //new value will be stored
        //  final int b = 10;
        // // b = 20; //error final variabel cant be changed
        //  System.out.println(b);

        final StringBuffer sb = new StringBuffer("Virat");
        sb.append(" kholi"); //final does not affect string object but the variable sb. Here we did not changed the sb but the object in sb.
        System.out.println(sb);

       //sb = new StringBuffer("sachin"); // As sb is final we cannot change it. This will give error.
       //System.out.println(sb);
    }
    
}
