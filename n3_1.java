
//Java Program to Reverse a String
public class n3_1 {
    public static void main(String[] args)
    {
        String name="Compiler";
        int l=name.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reverse str is: "+rev);
    }
}
