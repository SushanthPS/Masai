import java.util.*;
public class countSuchPairs {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int target=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=scan.nextInt();

        int count=0;

        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target)
                    count++;

        System.out.println(count);
    }
}
