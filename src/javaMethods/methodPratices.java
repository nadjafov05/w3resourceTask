package javaMethods;

public class methodPratices {
    //1. Find Smallest Number Among Three
    //Məqsəd: 3 ədəd arasında ən kiçiyini tapmaq.
    //Niyə vacibdir: Müqayisə əməliyyatlarını başa düşmək üçün əla başlanğıcdır. Real həyatda məsələn, 3 təklifdən ən ucuzu seçməkdə istifadə olunur.
    //Metod: Math.min() və ya sadə if-else ilə.

    public static void findSmallestNumbersAmongThree(int a,int b,int c){
        if (a > b && a > c){
            System.out.println("boyukdur");
        }else if (b > a && b > c){
            System.out.println("boyukdur");
        }else if (c > b && c > a){
            System.out.println("boyukdur");
        }else {
            if (a == b || a == c){
                System.out.println("bereberdi qiymet var: " + a);
            }else if (b == a || b == c){
                System.out.println("bereberdi qiymet var: " + b);
            }else if (c == b || c == a){
                System.out.println("bereberdi qiymet var: " + c);
            }
        }
    }

    //2. Compute Average of Three Numbers
    //Məqsəd: 3 ədədin ortalamasını hesabla.
    //İstifadə sahəsi: İmtahan nəticələrinin ortalaması, işçilərin əməkhaqqı və s.
    //Metod: (a + b + c) / 3.0

    public static void computeAverageOfThreeNumbers(){
        int a = 5;
        int c = 7;
        int b = 4;
        int cem = a + c + b;
        int bolme = cem / 3;
        System.out.println(bolme);
    }

    //6. Sum of Digits in Integer
    //Məqsəd: Məsələn, 25 üçün 2 + 5 = 7.
    //Real həyat: Banklarda kart PIN-lərində və ya rəqəmlə bağlı hesablarda istifadə olunur.
    //Metod: Dövrlə bölüb mod operatoru ilə son rəqəmi tapırıq.
    public static void sumOfDigitsInInteger(){
        int num = 251;
        int cem = 0;

        while (num!=0){
            int qaliq = num%10;
            num = num / 10;
            cem = cem + qaliq;
        }
        System.out.println(cem);
    }

    //10. Check Leap Year
    //Məqsəd: Bir ilin 366 gün olub-olmadığını yoxla.
    //İstifadə sahəsi: Təqvim proqramlarında və zamanla bağlı hesablarda vacibdir.
    //Metod: 4-ə bölünməsi və istisnalarla.
    public static void checkLeapYear(){
        int year = 2024;

        if (year%4 == 0 && year%100!=0){
            System.out.println("leap");
        }else if (year%100==0 && year%400!=0){
            System.out.println("no leap");
        }else if (year%400==0){
            System.out.println("leap");
        }else {
            System.out.println("sout");
        }
    }

    //17. Count Occurrences of Digit '2' in Integer
    //Məqsəd: Rəqəmdə neçə ədəd 2 var?
    //İstifadə: Məsələn, statistik hesabatlarda müəyyən rəqəmlərin təkrarını tapmaq.

    public static void countOccurrencesOfDigit2Integer(){
        int number = 222222222;

        int cem = 0;

        while (number != 0){
            int qaliq = number%10;

            if (qaliq == 2){
                cem++;
            }
            number = number / 10;
        }
        System.out.println(cem);
    }

    //22. Check If All Digits in Integer Are Even
    //Məqsəd: Bütün rəqəmlər cütdürmü?
    //İstifadə: Nümunəvi məlumatların yoxlanmasında, təhlükəsizlik kodlarının testində.
    public static void checkIfAllDigitsInIntegerAreEven(){
        int numbers = 123456789;

        while (numbers!=0){
            int bolme = numbers%10;
            if (bolme%2==0){
                System.out.println("cut elave olundu");
                numbers = numbers / 10;
            }else {
                System.out.println("cut olmayan tapildi");
                return;
            }
        }
    }

    //5. Count Words in String
    //Məqsəd: Verilmiş cümlədə neçə söz var.
    //İstifadə: SEO alətlərində və ya mətn analizlərində.
    //Metod: split(" ") və say.
    public static void countWordsInString(){
        String ss = "Salam";
        String[] ee = ss.split(" ");
        System.out.println(ee.length);
    }


}
