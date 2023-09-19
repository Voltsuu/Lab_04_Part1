import java.util.Scanner;

public class JavaMainFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variable declaration
        int intOperandA = 6;
        int intOperandB = 6;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA/intOperandB;
        int intModulo = intOperandA%intOperandB;
        double doubleOperandA = 12;
        double doubleOperandB = 12;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA/doubleOperandB;
        double doubleModulo = doubleOperandA%doubleOperandB;

                System.out.println("The sum of your numbers is " + intSum + "");
                System.out.println("The difference of your numbers is " + intDifference + "");
                System.out.println("The product of your numbers is " + intProduct + "");
                System.out.println("The quotient of your numbers is " + intQuotient +  "");
                System.out.println("The remainder of your numbers is " + intModulo +  "");

                System.out.println("The sum of " + doubleOperandA + doubleOperandB + " is: " + doubleSum);
                System.out.println("The difference of " + doubleOperandA + doubleOperandB + " is: " + doubleDifference);
                System.out.println("The product of " + doubleOperandA + doubleOperandB + " is: " + doubleProduct);
                System.out.println("The quotient of " + doubleOperandA + doubleOperandB + " is: " +  doubleQuotient);
                System.out.println("The remainder of " + doubleOperandA + doubleOperandB + " is: " + doubleModulo);
    }

}