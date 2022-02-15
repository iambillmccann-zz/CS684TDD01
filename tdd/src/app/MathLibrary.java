package app;

public abstract class MathLibrary {
    
     public static int Square(int number) {
         return number * number;
     }

     public static int ReverseDigits(int number) {
        int result = 0;
        int workNumber = number;

        while (workNumber > 0)
        {
            int remainder = workNumber % 10;
            result = (result * 10) + remainder;
            workNumber /= 10;
        }

        return result;
     }
}
