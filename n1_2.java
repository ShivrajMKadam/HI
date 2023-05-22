//Write a Java program to find the common elements between two arrays of integers

public class n1_2 {
            public static void main(String[] args)
        {
            int[] arr={8,15,6,21,25,20};
            int[] arr2={3,8,9,15,6,21};

            int i,j;
            for(i=0;i<arr.length;i++){
                for(j=0;j<arr2.length;j++){
                    if(arr[i]==arr2[j])
                    {
                        System.out.println(arr[i]+"");
                    }
                }
            }
        }
    }

