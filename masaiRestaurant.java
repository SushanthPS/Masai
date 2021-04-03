import java.util.*;
public class masaiRestaurant {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int q=scan.nextInt();
        Stack<Integer> stack=new Stack<>();
        while(q-- > 0)
        {
            int option=scan.nextInt();
            if(option==1)
            {
                if(!stack.empty())
                {
                    System.out.println(stack.peek());
                    stack.pop();
                }
                else
                    System.out.println("No Food");

            }
            else if(option==2)
                stack.push(scan.nextInt());

        }
    }

}
