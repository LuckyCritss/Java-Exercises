/*
this is where you can find the excersises -->
https://www.w3resource.com/java-exercises/basic/index.php
 */

import java.util.function.BinaryOperator;

public class Basic_Exercises {
    public static void main(String[] args) {
        System.out.println("1) " + "\n" + ex1("Gregory De Cock") + "\n");
        System.out.println("2) " + "\n" +  ex2(10,20) + "\n");
        System.out.println("3) " + "\n" +  ex3(10,20) + "\n");
        System.out.println("4) " + "\n" +  ex4(-5 + 8 * 6,(55+9) % 9, 20 + -3*5 / 8, 5 + 15 / 3 * 2 - 8 % 3) + "\n");
        System.out.println("5) " + "\n" +  ex5(25,5) + "\n");
        System.out.println("6) "); ex6(125,24);
        System.out.println("7) "); ex7(5);
        System.out.println("8) " + "\n" +  ex8() + "\n");
        System.out.println("9) " + "\n" +  ex9((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) + "\n");
        System.out.println("10) " + "\n" +  ex10(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))) + "\n");
        System.out.println("11) " + "\n" +  ex11(7.5) + "\n");
        System.out.println("12) " + "\n" +  ex12(80, 100, 150) + "\n");
        System.out.println("13) " + "\n" +  ex13(5.5,8.5) + "\n");
        System.out.println("14) " + "\n" +  ex14() + "\n");
        System.out.println("15) "); ex15(5.5,8.5);
        System.out.println("16) " + "\n" +  ex16() + "\n");
        System.out.println("17) " + "\n" +  ex17() + "\n");
        System.out.println("18) " + "\n" +  ex18() + "\n");
        System.out.println("19) " + "\n" +  ex19() + "\n");
        System.out.println("20) " + "\n" +  ex20() + "\n");
        System.out.println("21) " + "\n" +  ex21() + "\n");
        System.out.println("22) " + "\n" +  ex22() + "\n");
        System.out.println("23) " + "\n" +  ex23() + "\n");
        System.out.println("24) " + "\n" +  ex24() + "\n");
        System.out.println("25) " + "\n" +  ex25() + "\n");
        System.out.println("26) " + "\n" +  ex26() + "\n");
        System.out.println("27) " + "\n" +  ex27() + "\n");
        System.out.println("28) " + "\n" +  ex28() + "\n");
        System.out.println("29) " + "\n" +  ex29() + "\n");
        System.out.println("30) " + "\n" +  ex30() + "\n");

    }

    public static String ex1(String name){
        return "hello" + "\n" + name ;
    }

    public static int ex2(int x, int y){
        return x + y;
    }

    public static int ex3(int x ,int y){
        return y/x;
    }

    public static String ex4(int a, int b, int c, int d){
        return a + "\n" + b + "\n" + c + "\n" + d;
    }

    public static int ex5(int x, int y){
        return x*y;
    }

    public static void ex6(int x, int y){
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + x * y);
        System.out.println(x + " / " + y + " = " + x / y);
        System.out.println(x + " % " + y + " = " + x % y);
        System.out.println();
    }

    public static void ex7(int x){
        for (int y = 0;y <= 10;y++){
            System.out.println(x + " * " + y + " = " + x * y);
        }
        System.out.println();
    }

    public static String ex8(){
     return "   J    a   v     v  a \n"
             + "   J   a a   v   v  a a \n"
             + "J  J  aaaaa   V V  aaaaa \n"
             + " JJ  a     a   V  a     a";
    }

    public static double ex9(double x){
        return x;
    }

    public static double ex10(double x){
        return x;
    }

    public static String ex11(double radius){
        return "Perimeter is = " + 2 * Math.PI * radius +
                "\n"
                + "Area is = " + Math.PI * (radius * radius) ;
    }

    public static String ex12(int a, int b, int c){
        return "The average of the numbers = " + ((a+b+c)/3);
    }

    public static String ex13(double width, double height){
        return "Perimeter is = " + ((2 * width) + (2 * height)) +
                "\n"
                + "Area is = " + width * height;
    }

    public static String ex14(){
        return "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================";
    }

    public static void ex15(double a, double b){
        System.out.println("Before the swap the numbers are = " + a + " and " + b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After the swap the numbers are = " + a + " and " + b + "\n");
    }

    public static String ex16(){
        return " +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+";
    }

    public static String ex17(){
        String a = "10";
        String b = "11";
        int c = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return "the sum of the binary numbers: " + a + " and " + b + " = " + c;
    }

    public static String ex18(){
        String a = "10";
        String b = "11";
        int c = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return "the product of the binary numbers: " + a + " and " + b + " = " + c;
    }

    public static String ex19(){
        int a = 15;
        String b = Integer.toBinaryString(a);
        return "the binary conversion for the decimal number: " + a + " = " + b;
    }

    public static String ex20(){
        int a = 15;
        String b = Integer.toHexString(a);
        return "the hexadecimal conversion for the decimal number: " + a + " = " + b;
    }

    public static String ex21(){
        int a = 15;
        String b = Integer.toOctalString(a);
        return "the Octal conversion for the decimal number: " + a + " = " + b;
    }

    public static String ex22(){
        String a = "100";
        int b = Integer.parseInt(a,2);
        return "the decimal conversion for the binary number: " + a + " = " + b;
    }

    public static String ex23(){
        String a = "1101";
        int b = Integer.parseInt(a,2);
        String c = Integer.toHexString(b);
        return "the decimal conversion for the binary number: " + a + " = " + c;
    }

    public static String ex24(){
        String a = "111";
        int b = Integer.parseInt(a,2);
        String c = Integer.toOctalString(b);
        return "the octal conversion for the binary number: " + a + " = " + c;
    }

    public static String ex25(){
        String a = "10";
        int b = Integer.parseInt(a,8);
        return "the decimal conversion for the octal number: " + a + " = " + b;
    }

    public static String ex26(){
        String a = "7";
        String b = Integer.toBinaryString(Integer.parseInt(a,8));
        return "the binary conversion for the octal number: " + a + " = " + b;
    }

    public static String ex27(){
        String a = "100";
        String b = Integer.toHexString(Integer.parseInt(a,8));
        return "the hexadecimal conversion for the octal number: " + a + " = " + b;
    }

    public static String ex28(){
        String a = "25";
        int b = Integer.parseInt(a,16);
        return "the decimal conversion for the hexadecimal number: " + a + " = " + b;
    }

    public static String ex29(){
        String a = "37";
        String b = Integer.toBinaryString(Integer.parseInt(a,16));
        return "the binary conversion for the hexadecimal number: " + a + " = " + b;
    }

    public static String ex30(){
        String a = "40";
        String b = Integer.toOctalString(Integer.parseInt(a,16));
        return "the octal conversion for the hexadecimal number: " + a + " = " + b;
    }

}
