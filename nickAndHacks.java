import java.util.*;
import java.io.*;
public class nickAndHacks {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int t=Integer.parseInt(input[0]);
        while(t-- > 0)
        {
            input=br.readLine().split(" ");
            long n=Long.parseLong(input[0]);
            if(hacks(n,1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    public static boolean hacks(long n,long num)
    {
        boolean flag=false;
        if(num<n)
        {
            flag=hacks(n,num*10) | hacks(n,num*20);
        }
        else if(num==n)
            flag=true;
        else
            flag=false;
        return flag;

    }
}
