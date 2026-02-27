abstract class Hello{ //half assed class, cant be used to make an object.
    public String fname="Pratyush";
    private int age=21;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    static void hi(){ //static method belongs to the class, not object
        System.out.println("hello");
    }

    public abstract void type();

}

class Me extends Hello {
    public int gradYear=2027;

    public void type(){
        System.out.println("type shi");
    }
    }

public class Static{
    public static void main(String[] args){
        Hello.hi(); //that's why we ClassName.StaticMethod()
    Me prtdv= new Me();
    prtdv.type();
    
    int age=prtdv.getAge();
    System.out.println(age);

    prtdv.setAge(45);
    int age1=prtdv.getAge();
    System.out.println(age1);
    }
}

