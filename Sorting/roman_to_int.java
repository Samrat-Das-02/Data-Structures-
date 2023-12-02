import java.util.Scanner;

public class roman_to_int {
    public static int corresponding_value(char c)
    {
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;        
        if(c=='M')
            return 1000;
        return 0;    
    }
    public static int romanToInt(String s) {
       int len=s.length(); 
       int arr[]=new int[len];
       //int i=0;
       for(int i=0;i<len;i++)
       {
           arr[i]=corresponding_value(s.charAt(i));
       }
      int length = s.length();
    int sum = 0;
    int pre = 0;
    
    for(int i = len - 1; i >= 0; i--){
        int cur = arr[i];
        
        if(i == length - 1){
            sum = sum + cur;
        }else{
           if(cur < pre){
               sum = sum - cur;
           }else{
               sum = sum + cur;
           }
        }
        pre = cur;
    }
    
    return sum;
    }
    public static void main(String[] args)
    {
        String s=new String();
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(romanToInt(s));
        sc.close();
    }
}
