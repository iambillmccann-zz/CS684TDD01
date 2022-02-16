package app;

public abstract class MathLibrary {
    
     public static int Square(int number) {
         return number * number;
     }

     public static int ReverseDigits(int number) {
        int result = 0;
        for( ;number != 0; number=number/10) result = result * 10 + (number % 10);  
        return result;
    }
}
