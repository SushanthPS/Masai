import java.util.*;
class temp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int n=scan.nextInt();
            int[] price=new int[n];
            for(int i=0;i<n;i++)
                price[i] = scan.nextInt();

            Stack<Integer> stack=new Stack<>();
            stack.push(0);
            int[] span=new int[n];
            span[0]=1;

            for(int i=1;i<n;i++)
            {
                while(!stack.isEmpty() && price[stack.peek()]<=price[i])
                    stack.pop();
                if(stack.isEmpty())
                    span[i]=i+1;
                else
                    span[i]=i-stack.peek();
                stack.push(i);
            }
            for(int i=0;i<n;i++)
                System.out.print(span[i]+" ");
            System.out.println();

        }
    }
}