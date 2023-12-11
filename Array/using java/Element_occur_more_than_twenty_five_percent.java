import java.util.*;
public class Element_occur_more_than_twenty_five_percent {
    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int count,element=0;
        for(int ele:arr)
        {
            if(mpp.containsKey(ele))
            {
                mpp.put(ele,mpp.get(ele)+1);
            }
            else 
                mpp.put(ele,1);
        }
        for(HashMap.Entry<Integer,Integer> entry:mpp.entrySet())
        {
            float p=entry.getValue()*100;
            if(p/arr.length>25)
                {
                    element=entry.getKey();
                    break;
                }
            // System.out.println(entry.getKey()+"="+entry.getValue());  
            // System.out.println(p/arr.length);  
            
        }
        return element;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }        
        System.out.println("The element which occurs more than 25% : "+findSpecialInteger(arr));
    }
}
