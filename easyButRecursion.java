import java.util.*;
public class easyButRecursion {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scan.nextInt();

            System.out.println(sum(arr,0,n-1));
        }
    }
    public static int sum(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            return sum(arr,left,mid)+sum(arr,mid+1,right);
        }
        else
            return arr[left];

    }
}
