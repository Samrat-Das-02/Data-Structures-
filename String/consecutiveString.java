import java.util.*;

//import javax.naming.spi.DirStateFactory.Result;
public class consecutiveString {
    /**
     * @param args
     */
    public static String modifyString(String s)
    {
        char array[]=s.toCharArray();
        for(int i=0; i<array.length;i++)
        {
               if(array[i]=='?')
               { 
                    array[i]='a';
                        if(i!=0)
                        {
                            if(array[i]==array[i-1])
                                array[i]++;
                        }
                        if(i!=array.length-1)
                        {
                            if(array[i]==array[i+1])
                                {
                                    array[i]++;
                                    if(array[i]==array[i-1])
                                        array[i]++;
                                }
                        }
                    }
        }
        return new String(array);
    }
   public static void main(String[] args)
    {
        System.out.println("Enter a String :");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println("The modified String is");
        System.out.println(modifyString(s));
        scanner.close();
    }
}
