
//How to Check if the String Contains 'e' in umbrella
public class n2_2 {
    public static void main(String[] args)
    {
        String str="Umbrella";
        boolean n=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                n=true;
                break;
            }
        }

        System.out.println(n);
    }
}
