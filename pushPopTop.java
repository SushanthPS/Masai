import java.util.*;
public class pushPopTop {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        Stack<Integer> stack=new Stack<>();
        while(t-- > 0)
        {

            int ele;
            int option=scan.nextInt();
            if(option==1)
            {
                ele=scan.nextInt();
                stack.push(ele);
            }
            else if(option==2 && !stack.empty())
                stack.pop();
            else if(option==3)
            {
                if(!stack.empty())
                    System.out.println(stack.peek());
                else
                    System.out.println("Empty!");
            }

        }
    }
}
