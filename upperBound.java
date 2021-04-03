import java.util.*;
public class upperBound {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int ans=-1;

        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(k==arr[mid])
                low=mid+1;
            else if(arr[mid]>k)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println(ans);
    }
}
