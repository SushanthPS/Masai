import java.util.*;
public class smallerNeighbourElement {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                stack.push(arr[i-1]);
            else {
                for (int j = stack.size() - 1; j >= 0; j--)
                    if (stack.get(j) < arr[i]) {
                        stack.push(stack.get(j));
                        break;
                    }
            }

        }

        for(int i=0;i<stack.size();i++)
            System.out.print(stack.get(i)+" ");

    }
}
