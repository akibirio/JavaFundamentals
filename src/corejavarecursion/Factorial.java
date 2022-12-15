package corejavarecursion;

/**
 * Factorial
 */
public class Factorial {

    public static int getFactorial(int number) {
        int result = 1;
        // calculating factorial using while loop
        while(number!=0){
            result = number * getFactorial(number-1);
            break;
        }
        return result;
    }

    public static void main(String[] args) {
        int inputNumber = 3;
        System.out.println(inputNumber + " Factorial " + getFactorial(inputNumber));
    }
    
}