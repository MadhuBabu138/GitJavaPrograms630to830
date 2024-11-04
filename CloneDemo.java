import java.util.Objects;
class Student implements Cloneable
{
	private int sno;
	private String sname,branch;
	public Student() {
		System.out.println("constructor is invoked..");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(branch);
	}
	
	@Override
	public boolean equals(Object obj) //s1 
	{
		//obj=s2
		//this=s1
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		//other=s2
		return Objects.equals(this.sname, other.sname) && sno == other.sno;
	}
	@Override
	public String toString()
	{
		//return getClass().getName()+"@[sno="+sno+",sname="+sname+",branch="+branch+"]";
		return getClass().getName()+"@["+sno+","+sname+","+branch+"]";
	}
	/*
	 1. access modifier same or higher
	 2. return type same
	 3. method name same
	 4. parameters count,type and order must be same
	 5. if base method throws an exception then the child method
	*/
	@Override
	public  Object clone() throws CloneNotSupportedException  
	{	//s1
		Object o=super.clone(); //Up-casting
		//clone method creates a copy of the present object and returns it.
		return o;
	}
}

public class CloneDemo {
    public static void main(String[] args) throws Exception{
		Student s1=new Student();
		//s1 object initialization
		s1.setSno(1);
		s1.setSname("Madhu.k");
		s1.setBranch("cse");
		Student s2=(Student)s1.clone(); //down casting
		
		System.out.println("s1:\t"+s1);
		System.out.println("s2:\t"+s2);
		
		if(s1==s2)
			System.out.println("addresses are same");
		else
			System.out.println("addresses are different");
	}

}
