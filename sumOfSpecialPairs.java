import java.util.*;
public class sumOfSpecialPairs {
    public static boolean isPrime(int value)
    {
        if(value<=1)
            return false;
        for(int i=2;i<value;i++)
            if(value%i==0)
                return false;
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        int sum=0;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPrime(j-i))
                    sum+=Math.abs(arr[i]-arr[j]);
            }
        }
        System.out.println(sum);
    }
}
