import java.util.function.Function;

public class Main {
public static void main(String[] args) {

    System.out.println(Math.pow(3,20));
    System.out.println(Percon.POW(3,20));


    Percon id1 = new Percon("Aziz", 40);
    Percon id2 = new Percon("Oleg", 42);
    Percon.Status = "People";
    id1.PrintPerc();
    id2.PrintPerc();


}}

class Percon {

    private String name;
    private int age;
    static String Status = "Russians";

    Percon(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void PrintPerc () {
        System.out.println(name + " " + age +  " " + Status);
    }
    public static double POW(double x,double y){
        return Math.pow(x, y);
    }
}