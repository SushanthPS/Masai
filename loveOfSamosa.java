import java.util.*;

public class loveOfSamosa {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int K=scan.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=scan.nextInt();

        Arrays.sort(arr);
        int sum=0;
        int count=0;


        for(int i:arr)
        {
            sum+=i;
            if(sum<=K)
                count++;
            else if(sum>K)
                break;

        }
        System.out.println(count);


    }
}