import java.util.*;
public class applyBasicMaths {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        int index=-1;
        int num=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if((sum-arr[i])%7==0 && arr[i]<num)
            {
                index=i;
                num=arr[i];
            }
        }
        System.out.println(index);
    }
}
