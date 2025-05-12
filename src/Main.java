
public class Main {


    public static void main(String[] args) {
        System.out.println(integralKvadret(0,2,x -> {
            return Math.pow(x,2);
        }));
    }
    public static double integralKvadret(double a, double b, Function function){
        double area = 0;
        double h = 0.01;

        for (int i = 0; i < (b-a)/h; i++) {area += h * function.funk( a + i * h);
        }
        return area;

}}

interface Function {
    public double funk(double x);


}