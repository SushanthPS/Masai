import java.util.*;
public class masaiDivisors {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int left=scan.nextInt();
        int right=scan.nextInt();
        int k=scan.nextInt();
        int count=0;
        for(int i=left;i<=right;i++)
            if(i%k==0)
                count++;

        System.out.println(count);

    }
}
