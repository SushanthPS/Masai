import java.io.*;
import java.util.*;
public class angryEmployees {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String[] input=br.readLine().split(" ");
            int n=Integer.parseInt(input[0]);
            int c=Integer.parseInt(input[1]);
            int[] arr=new int[n];

            input=br.readLine().split(" ");
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(input[i]);

            Arrays.sort(arr);
            int low=0;
            int high=arr[n-1];
            int ans=-1;

            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(employeeDistance(arr,mid,n,c))
                {
                    low=mid+1;
                    ans=mid;
                }
                else
                    high=mid-1;
            }
            System.out.println(ans);
        }
    }

    public static boolean employeeDistance(int[] arr, int mid, int n, int c)
    {
        int seat=arr[0];
        int count=1;
        for(int i=1;i<n;i++) {
            if (arr[i] - seat >= mid) {
                seat = arr[i];
                count++;
            }
            if (count == c)
                return true;
        }

        return false;

    }

}
