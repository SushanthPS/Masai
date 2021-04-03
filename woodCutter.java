import java.util.*;
public class woodCutter {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        long m=scan.nextLong();
        long[] arr=new long[(int) n];
        long max=0;
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextLong();
            if (arr[i] > max)
                max = arr[i];
        }

        long low=0;
        long high=max;
        long ans=-1;

        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(checkWood(arr,m,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println(ans);
    }
    public static boolean checkWood(long[] arr,long m,long mid)
    {
        long sum=0;
        for(long i:arr)
        {
            if(i>mid)
                sum+=(i-mid);
        }
        if(sum>=m)
            return true;
        else
            return false;
    }
}
