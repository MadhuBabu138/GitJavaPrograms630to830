import static java.lang.System.*;
class RW
{ 	
    static public <E> void write(E []arr)
	{	out.println("Elements in an array");
		for(E v:arr)
		{out.print(v+"\t");
		}
	}
}
class GenericMethods
{	public static void main(String args[])
	{	Integer arr[]=new Integer[]{10,20,30,40,50};
        RW.write(arr);
		out.println();
        String []arr2=new String[]{"Nandini","Tirumala","Joyes(NL)","Sruthi","Roja"};
		RW.write(arr2);
	}
}
