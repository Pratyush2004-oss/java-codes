import java.util.Scanner;
class A{ 
    void show(String n, int b){
        System.out.println("10");
    }
    void show(int a){
        System.out.println("20");
    }
    int show(int a,float  w){
        System.out.println("30");
        return 0;
    }
    void show(Object s){
        System.out.println("HEllo World");
    }
}

public class OOPSJava{
    public static void main(String args[]){
        A s1 = new A();

        s1.show('t');
        s1.show(null, 0);
        s1.show(0, 5f);
        s1.show(45f);

    }
}
