import java.util.*;
public class lowerBound {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int ans=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<k)
                low=mid+1;
            else
                high=mid-1;
        }
        System.out.println(ans);
    }
}
