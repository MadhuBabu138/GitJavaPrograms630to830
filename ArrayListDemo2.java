import java.util.*;
public class ArrayListDemo2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al1=new ArrayList<Integer>();    
        al1.add(100);
        al1.add(100);
        al1.add(200);
        al1.add(300);
        ArrayList<Integer> al2=new ArrayList<Integer>();    
        al2.add(1000);
        al2.add(2000);
        al2.add(3000);
        al2.add(100);
        al1.addAll(al2);
        System.out.println("al1:\t"+al1);
        Iterator<Integer> io =al1.iterator();
        System.out.println("size of al1:\t"+al1.size());
        System.out.println("elements before while:\t"+al1);
        System.out.println("Elements existed in al1..");
        while (io.hasNext()) 
        {
            Integer i=io.next(); //i=100,200,300,1000,2000,3000
            if(i==100)
                io.remove();
        }
        System.out.println("size of al1 after while:\t"+al1.size());
        System.out.println("elements after while:\t"+al1);
    }
}
