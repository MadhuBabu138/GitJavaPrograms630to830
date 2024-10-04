class Calc
{
    //add(int,int)
    int add(int a,int b){
        return a+b;
    }
    //add(int,int,int)
    int add(int a,int b,int c){
        return a+b+c;
    }
    //add(int,float)
    float add(int a,float b){
        return a+b;
    }
    //add(float,int)
    float add(float a,int b){
        return a+b;
    }
    //add(float,float)
    float add(float a,float b){
        return a+b;
    }
    //add(int,double)
    double add(int a,double b){
        return a+b;
    }
    //add(double,int)
    double add(double a,int b){
        return a+b;
    }
    //add(double,double)
    double add(double a,double b){
        return a+b;
    }
}
public class MethodOverload
{
    public static void main(String[] args) 
    {
        Calc calc=new Calc();
        System.out.println(calc.add(10, 2));    
        System.out.println(calc.add(10, 2.50));    
        System.out.println(calc.add(10.50, 2.50));    
        
    }
}