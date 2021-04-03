import java.util.*;
public class masaiPalindromicSubstring {
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int maxLength=0;
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<s.length()+1;j++)
            {
                String abc=s.substring(i,j);
                if(isPalindrome(abc) && abc.length()>maxLength)
                    maxLength=abc.length();
            }

        System.out.println(maxLength);
    }
}
