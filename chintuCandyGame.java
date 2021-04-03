import java.util.*;
public class chintuCandyGame {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int s = scan.nextInt();
            int temp=s;
            int cashback = 0;
            int total = s;
            while(temp>=10)
            {
                cashback=temp/10;
                total += cashback;
                temp=(temp/10)+(temp%10);
            }
            System.out.println(total);
        }
    }
}

/* 9876 candies + 987 candies + 99 candies(987+6) + 10 candies(99+3) + 1 candy(10+2) */