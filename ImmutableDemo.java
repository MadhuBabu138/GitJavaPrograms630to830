record One(int a,int b) { }
public class ImmutableDemo {
    public static void main(String[] args) {
        One o1=new One(100,200);//o1 object is immutable because it's state can't be changeable
        System.out.println(o1.a());
        System.out.println(o1.b());
    }    
}
