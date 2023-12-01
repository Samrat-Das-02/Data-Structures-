import java.util.Scanner;

public class consecutiveString2 {
    public static String modifyString(String s)
    {
        char array[]=s.toCharArray();
        for(int i=0; i<array.length;i++)
        {
               if(array[i]=='?')
               { 
                    array[i]='a';
                        if(i!=0&&i!=1)
                        {
                            if(array[i]==array[i-1]&&array[i]==array[i-2])
                                array[i]='b';
                        }
                        if(i<array.length-3)
                        {
                            if(array[i]==array[i+1]&&array[i]==array[i+2])
                                {
                                    array[i]='b';
                                    if(array[i]==array[i-1]&&array[i]==array[i-2])
                                            array[i]='b';
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
