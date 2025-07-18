package conditionalStatement;

public class Conditional {

    //1. Check Positive or Negative Number
    //
    //Write a Java program to get a number from the user and print whether it is positive or negative.
    //
    //Test Data
    //Input number: 35
    //Expected Output :
    //Number is positive
    public static void positiveOrnegativeNumber(int n) {
        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
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
    public static void greatestAmongThreeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }


    //4. Check Positive, Negative, or Zero (with Range)
    //
    //Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
    //
    //Test Data
    //Input a number: 25
    //Expected Output :
    //Input value: 25
    //Positive number
    public static void checkPositiveNegativeOrZeroNumberRange(){
        double number = 0.6;

        if (number == 0) {
            System.out.println("zero");
        }
        if (number > 0) {
            System.out.println("positive number");
        }
        if (number < 0) {
            System.out.println("negative number");
        }

        // small number yoxlaması (Math.abs istifadə etmədən)
        if (number > -1 && number < 1 && number != 0) {
            System.out.println("small number");
        }

        if (number > 1000000 || number < -1000000) {
            System.out.println("large number");
        }
    }

//5. Weekday Name from Number
    //
    //Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
    //
    //Test Data
    //Input number: 3
    //Expected Output :
    //Wednesday

    public static void weekdayNameFromNumber(){
        String[] weekDay = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int weekNumber = 1;

        if (weekNumber >= 1 && weekNumber <= 7){
            System.out.println(weekDay[weekNumber - 1]);
        }else {
            System.out.println("hefteye uygun tapilmadi");
        }
    }

    //6. Compare Floats Up to Three Decimals
    //
    //Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
    //
    //Test Data
    //Input floating-point number: 25.586
    //Input floating-point another number: 25.589
    //Expected Output :
    //They are different

    public static void compareFloatsUpToThreeDecimals(){
        double n = 25.56;
        double a = 25.56;

        if ((int)(n*1000) == (int)(a*1000)){
            System.out.println("eynidir");
        }else {
            System.out.println("eyni deyil");
        }
    }


    //7. Days in a Month
    //
    //Write a Java program to find the number of days in a month.
    //
    //Test Data
    //Input a month number: 2
    //Input a year: 2016
    //Expected Output :
    //February 2016 has 29 days

    public static void dayInMoth(){
        int il = 2019;
        int ay = 2;
        int gun = 0;
        String ayAdi = "";

        if (ay == 1){
            ayAdi = "Yanvar";
            gun = 30;
        }else if (ay == 2) {
            ayAdi = "Fevral";
            if ((il % 4 == 0 && il % 100 != 0) || (il % 400 == 0)) {
                gun = 29;
            } else {
                gun = 28;
            }
        }else if (ay == 3){
            ayAdi = "Mart";
            ay = 31;
        }else if (ay == 4){
            ayAdi = "Aprel";
            ay = 30;
        }else if (ay == 5){
            ayAdi = "May";
            ay = 31;
        }else if (ay == 6){
            ayAdi = "Iyun";
            ay = 30;
        }else if (ay == 7){
            ayAdi = "Iyul";
            ay = 31;
        }else if (ay == 8){
            ayAdi = "Avqust";
            ay = 31;
        }else if (ay == 9){
            ayAdi = "Sentyabr";
            ay = 30;
        }else if (ay == 10){
            ayAdi = "Oktyabr";
            ay = 31;
        }else if (ay == 11){
            ayAdi = "Noyabr";
            ay = 30;
        }else if (ay == 12){
            ayAdi = "Dekabr";
            ay = 31;
        }else {
            System.out.println("bele ay veya ay-adi yoxdur");
        }
    }


    //10. Display First 10 Natural Numbers
    //
    //Write a Java program to display the first 10 natural numbers.
    //
    //Expected Output :
    //
    //The first 10 natural numbers are:

    public static void first10NaturalNumbersDisplay(){
        int a = 10;
        for (int i=1;i<=a;i++){
            System.out.println(i);
        }
    }

    //11. Natural Numbers and Their Sum
    //
    //Write a Java program to display n terms of natural numbers and their sum.
    //
    //Test Data
    //Input the number: 2
    //Expected Output :
    //
    //Input number:
    //2
    //The first n natural numbers are :
    //2
    //1
    //2
    //The Sum of Natural Number upto n terms :
    //23

    public static void naturalNumbersAndTheirSum(){
        int enter = 3;
        int count = 0;

        for (int i=1;i<=enter;i++){
            count = count + i;
        }
        System.out.println(count);
    }

//12. Sum and Average of 5 Numbers
//
//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
//
//Test Data
//Input the 5 numbers : 1 2 3 4 5
//Expected Output :

    public static void sumAndAverageNumbers(){
        int number = 5;

        //buraya toplayiriq ededleri
        int cem = 0;

        //burda ortalama ededi tapmaq ucun teyin edirik
        int ortalama = 0;

        //dovr ile i elementlerini cixardib,her defe i elementlerini elave edirik cem deyisenine ve toplanir ust uste
        for (int i=1;i<=number;i++){
            //cem deyiseninde i elementleri her defe ustune gelir
            cem = cem + i;
        }

        //ortalama olan deyisenine menimsedirik  toplanilmis(cem) deyisenini boluruk verilmis numbere
        //ve ortalamani tapmaq ucun ilk once toplanilmis cemi boluruk elementin uzunluqu teyin olunan reqeme yeni misal 5
        ortalama = cem / number;
        //cemi cap edir
        System.out.println(cem);
        //ortalamani cap edir
        System.out.println(ortalama);
    }


    //13. Display Cubes of Numbers
    //
    //Write a Java program to display the cube of the given number up to an integer.
    //
    //Test Data
    //Input number of terms : 4
    //Expected Output :
    //
    //Number is : 1 and cube of 1 is : 1
    //Number is : 2 and cube of 2 is : 8
    //Number is : 3 and cube of 3 is : 27
    //Number is : 4 and cube of 4 is : 64

    public static void displayCubesOfNumbers(){
        int n = 5;

        for (int i=1;i<=n;i++){
            System.out.printf("Ədəd: %d və %d-in kubu: %d\n", i, i,( i * i * i));
        }
    }
}
