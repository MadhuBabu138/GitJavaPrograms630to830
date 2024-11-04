import java.util.*;
public class ArrayListDemo 
{   
    public static void main(String[] args) 
    {   ArrayList<String> al=new ArrayList<String>();
        System.out.println("al size is:\t"+al.size());
        al.add("madhu");
        al.add("dharani");
        al.add("pushya");
        al.add("ramya");
        al.add("srivallika");
        al.add("sonalika");
        al.add("bharghavsai");
        al.add("konda reddy");
        al.add("anjaneyulu");
        al.add("dinesh");
        al.add("omkar");
        System.out.println("Elements in an array");
        Iterator<String> io=al.iterator();
        while(io.hasNext())
        {   System.out.println(io.next());
        }
    }
}
