package Lesson1;

public class FirstLesson {
    public static void main(String[] args) {
        System.out.println("1.");
        firstEx();
        System.out.println("\n2.");
        System.out.println("a * (b + (c / d)) = " + secondEx(7,8,9,13));
        System.out.println("\n3.");
        System.out.println(thirdEx(10, 20));
        System.out.println("\n4.");
        fourthEx(-1);
        System.out.println("\n5.");
        System.out.println(fifthEx(-322));
        System.out.println("\n6.");
        sixthEx("Aikkervi");
        System.out.println("\n7.");
        seventhEx(2100);
    }

    static void firstEx() {

        byte bt = 42;
        short sh = 8800;
        int in = 555;
        long ln = 3535L;
        float fl = 66.11f;
        double db = 606.1669;
        char sb = 'c';                             //Поэкспериментировал с типом данных char
        char nu = 322;
        char un = '\u42AA';
        boolean bo = false;

        System.out.println("byte = " + bt);
        System.out.println("short = " + sh);
        System.out.println("int = " + in);
        System.out.println("long = " + ln);
        System.out.println("float = " + fl);
        System.out.println("double = " + db);
        System.out.println("char символ : " + sb);
        System.out.println("char номер : " + nu);
        System.out.println("char Юникод : " + un);
        System.out.println("boolean = " + bo);
    }

    static double secondEx(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    static boolean thirdEx(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    static void fourthEx(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + "положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static boolean fifthEx(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void sixthEx(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void seventhEx(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else {
            System.out.println(year + " г. високосный");
        }
    }
}
