import java.util.*;
import static java.lang.System.*;
public class StackDemo 
{
    public static void main(String[] args) 
    {       
        Scanner scanner=new Scanner(in) ;
        ArrayList<Integer> al=new ArrayList<Integer>();
        do{
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.view");
            System.out.print("Enter your option(1/2/3/4):\t");
            int opt=scanner.nextInt();
            switch (opt) {
                case 1:
                        System.out.println("Enter int element to push:\t");
                        int ele=scanner.nextInt(); //10
                        al.add(ele);
                        break;
                case 2:
                        int r_ele=al.remove(al.size()-1);
                        System.out.println("Popped element is:\t"+r_ele);
                        break;
                case 3:
                        int peek_ele=al.get(al.size()-1);
                        System.out.println("Peek element:\t"+peek_ele);
                        break;
                case 4:
                        System.out.println("Elements of stack:\t"+al);
                        break;
                default:
                        System.out.println("Invalid Option...");
                        break;
            }
            System.out.println("do you want to continue(yes/no):\t");
            String yes_no=scanner.next();
            if(yes_no.equals("no"))
            {   break;
            }
        }while(true);
    }
}
