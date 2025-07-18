package conditionalStatement;

public class Conditional {
    public static void main(String[] args) {

    }

    //1. Check Positive or Negative Number
    //
    //Write a Java program to get a number from the user and print whether it is positive or negative.
    //
    //Test Data
    //Input number: 35
    //Expected Output :
    //Number is positive
    public static void positiveOrnegativeNumber(int n) {
        if (n > 0){
            System.out.println("positive");
        }else if (n < 0){
            System.out.println("negative");
        }else {
            System.out.println("numbers in not - " + n);
        }
    }
}
