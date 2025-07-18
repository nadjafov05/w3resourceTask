package conditionalStatement;

public class Conditional {
    public static void main(String[] args) {
        greatestAmongThreeNumbers(1,2,1);
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

    //3. Find Greatest Among Three Numbers
    //
    //Write a Java program that takes three numbers from the user and prints the greatest number.
    //
    //Test Data
    //Input the 1st number: 25
    //Input the 2nd number: 78
    //Input the 3rd number: 87
    //Expected Output :
    //The greatest: 87
    public static void greatestAmongThreeNumbers(int a,int b,int c){
        if (a > b && a > c){
            System.out.println(a);
        }else if (b > a && b > c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
