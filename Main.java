import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String x="hello world, my name is ";
        String y="prtdv";
        int passL;
        System.out.println("Enter your PassL");
        Scanner sc=new Scanner(System.in);
        passL=sc.nextInt();
        System.out.println(passL<=10 && passL==1);
        System.out.println(passL<=10 && (passL==1));
        System.out.println((x+y).length());
        System.out.println("Hi it's \"test\" ptdv");
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("where"));
        

    }
}