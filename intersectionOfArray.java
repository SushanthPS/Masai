import java.util.*;
public class intersectionOfArray {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            set.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            b[i]=scan.nextInt();
        }

        for(int i:b)
            if(set.contains(i))
            {
                System.out.println(i);
                break;
            }


    }
}
