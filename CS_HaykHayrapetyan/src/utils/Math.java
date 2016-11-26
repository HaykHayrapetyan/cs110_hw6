package utils;

public class Math {
    public static int factorial(int n){
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    
    public static int factorialLoop(int n){
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
}
