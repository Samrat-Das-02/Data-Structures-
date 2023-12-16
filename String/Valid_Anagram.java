// Given two strings s and t, 
//return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters 
//of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

import java.util.*;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        HashSet<Character> char_set=new HashSet<>();
        char[] string1=t.toCharArray();
        char[] string2=s.toCharArray();
        if(string1.length!=string2.length)
            return false;
        Arrays.sort(string1);
        Arrays.sort(string2);
        for(int i=0;i<string1.length;i++)
        {
            if(string1[i]!=string2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String :");
        String first = scanner.nextLine();
        System.out.println("Enter Second String :");
        String second = scanner.nextLine();
        System.out.println("The two strings are in same Anagram ? (True / False) Ans : "+isAnagram(first, second));
    }
}
