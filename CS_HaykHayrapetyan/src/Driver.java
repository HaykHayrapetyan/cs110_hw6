import Shapes.Square;
import Shapes.Rectangle;
import utils.Math;

public class Driver {

    public static void main(String[] args) {
       Square a = new Square(100);
       System.out.println("Area of the square = " + a.getArea());
       
       Rectangle b = new Rectangle(50, 80);
       System.out.println("Area of the rectangle = " + b.getArea());
       
       System.out.println();
       
       double x = 15.6;
       System.out.println("Factorial of 15.6 = " + Math.factorial((int)x));
       System.out.println("FactorialLoop of 15.6 = " + Math.factorialLoop((int)x));
    }   
}
