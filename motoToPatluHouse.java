import java.util.*;
public class motoToPatluHouse {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int steps=0;
        if(n%5==0)
            steps=n/5;
        else if(n>5)
            steps=n/5+1;
        else
            steps=1;

        System.out.println(steps);

    }
}
