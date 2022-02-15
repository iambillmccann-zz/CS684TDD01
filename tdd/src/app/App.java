package app;
// import app.MathLibrary;

public class App {
    private static String QUITSTRING = "Q";

    /**
     * getUserInput is a simple method for reading from the console.
     * 
     * @return    A string that represents the user's input.
     */
    private static int getUserInput() {
        System.out.print("What problem shall I run? Or type 'Q' to quit. ");
        return checkUserInput(System.console().readLine());
    }   
    
    /**
     * checkUserInput will validate the user's input. This is a very redimentary
     *  validation method. It checks three things ...
     *  1. Checks for the letter "Q"
     *  2. Checks for an integer
     *  3. Checks that the integer is positive
     *  These checks assume that problems are solved in order.
     *  Note: If the user enters "Q", a minus one is returned to the caller.
     * 
     * @param userInput The string entered by the user
     * @return          An integer representing the problem number or -1 to quit
     */
    private static int checkUserInput(String userInput) {
        int result = -1;
        if (userInput.equalsIgnoreCase(QUITSTRING)) return result;

        try
        {
            result = Integer.parseInt(userInput);
            if (result < 1)
            {
                System.out.println("\nBTW, please enter a natural number.");
                result = getUserInput();
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("\nSorry but I did not understand that. Please type a natural number or Q to quit.");
            result = getUserInput();
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        int startingNumber = 0;

        System.out.println("Program to reverse the digits in a number");

        startingNumber = getUserInput();
        while (startingNumber > 0) {

            int result = MathLibrary.ReverseDigits(startingNumber);
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.println("Starting Number is " + startingNumber);
            System.out.println("The reversed number is " + result);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();
            startingNumber = getUserInput();
        }
    }
}
