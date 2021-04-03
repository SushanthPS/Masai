import java.util.*;
public class substringUnderCondition {

    public static int substr(String s,int i,int j,int n) {

        if(n==1)
            return 1;
        if(n<=0)
            return 0;

        int count=substr(s,i,j-1,n-1)+substr(s,i+1,j,n-1)-substr(s,i+1,j-1,n-2);


        if(s.charAt(i)==s.charAt(j))
            count++;

        return count;

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int n=s.length();
        System.out.println(substr(s,0,n-1,n));
    }
}
