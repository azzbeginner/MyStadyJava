import java.util.function.Function;

public class Main {
public static void main(String[] args) {
Percon id1 = new Percon("Aziz", 40);
Percon id2 = new Percon("Oleg", 42);

    id1.PrintPerc();
    id2.PrintPerc();


}}

class Percon {

    private String name;
    private int age;

    Percon(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void PrintPerc () {
        System.out.println(name + " " + age);
    }
}