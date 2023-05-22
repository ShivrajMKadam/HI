//Write a Java program to check that String is palindrome or not

public class n3_2 {
    public static void main(String[] args)
    {
        String name="mom";
        String rev="";

        //reverse string part
        int l=name.length();
        //String rev="";
        for(int i=l-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }

        if(name.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
