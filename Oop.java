public class Oop{
    int x;
    String fname, lname;

    public Oop(){
    int x=0;
    fname = "John";
    lname = "Doe";
    }
    
    static void myMethod(String x) { //no need to create an object to call it
    System.out.println(x);
    }

    public Oop(int x, String fname, String lname){
        this.x=y;
        this.fname=fname;
        this.lname=lname;
    }
    public static void main(String[] args){
        Oop nclass= new Oop(5,"lol ","dev");
        Oop nc2= new Oop();
        nc2.x=14;
        System.out.println(nclass.x);
        myMethod("blolob");
        System.out.println(nclass.fname+nclass.lname);
        nc2.myMethod("lmao");
        System.out.println(nc2.x+nc2.fname+nc2.lname);
    }
}