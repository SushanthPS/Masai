import java.util.*;
public class makeNewString {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        char[] ch=s.toCharArray();
        int value=0;
        for(int i=0;i<ch.length;i++)
        {
            value=(ch[i]-'a')*(ch[i]-'a');
            ch[i]= (char) ((value%26)+97);
        }
        System.out.println(String.valueOf(ch));

    }
}
