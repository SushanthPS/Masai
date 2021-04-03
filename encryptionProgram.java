import java.io.*;
import java.util.*;
public class encryptionProgram {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n=Integer.parseInt(br.readLine());
            String str=br.readLine();
            System.out.println(encrypt(str));
        }
    }

    public static String encrypt(String str)
    {
        int mid=(str.length()+1)/2-1;
        if(mid>0)
            return str.charAt(mid) + encrypt(str.substring(0, mid)) + encrypt(str.substring(mid + 1));
        else if(mid<0)
            return "";
        else
            return str.substring(mid);

    }
}
