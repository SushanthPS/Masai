import java.io.*;
import java.util.Arrays;

class nikhilAndHisSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int n=Integer.parseInt(strArr[0]);
        strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(strArr[i]);
        Arrays.sort(arr);
        strArr = br.readLine().split(" ");
        int q=Integer.parseInt(strArr[0]);
        while(q-- > 0)
        {
            strArr = br.readLine().split(" ");
            int option = Integer.parseInt(strArr[0]);
            int x = Integer.parseInt(strArr[1]);
            int low=0;
            int high=n-1;
            int ans=-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(option==0)
                {
                    if(arr[mid]>=x)
                    {
                        ans=mid;
                        high=mid-1;
                    }
                    else
                        low=mid+1;
                }
                else if(option==1)
                {
                    if(arr[mid]>x)
                    {
                        ans=mid;
                        high=mid-1;
                    }
                    else
                        low=mid+1;
                }
            }
            if(ans==-1)
                System.out.println("0");
            else
                System.out.println(n-ans);

        }
    }
}
