import java.util.*;
public class discoverNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int t=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        Arrays.sort(arr);

        while(t-- > 0)
        {
            boolean flag=false;
            int num=scan.nextInt();
            int low=0;
            int high=n-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(arr[mid]==num)
                {
                    flag=true;
                    break;
                }
                else if(num>arr[mid])
                    low=mid+1;
                else
                    high=mid-1;

            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
