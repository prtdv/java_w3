public class Oop{
    int x=0;
    String fname = "John";
    String lname = "Doe";
    static void myMethod(String x) {
        System.out.println(x);
    }
    public static void main(String[] args){
        Oop nclass= new Oop();
        Oop nc2= new Oop();
        nc2.x=14;
        myMethod("blolob");
        System.out.println(nclass.fname+nclass.lname);
        nc2.myMethod("lmao");
        System.out.println(nc2.x);

    }
}