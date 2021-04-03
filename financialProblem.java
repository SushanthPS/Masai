import java.util.*;
import java.io.*;
class financialProblem
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n=Integer.parseInt(br.readLine());
            int[] price=new int[n];
            String[] input=br.readLine().split(" ");
            for(int i=0;i<n;i++)
                price[i] = Integer.parseInt(input[i]);

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
            for(int i=0;i<span.length;i++)
                System.out.print(span[i]+" ");
            System.out.println();

        }
    }
}