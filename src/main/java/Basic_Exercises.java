/*
this is where you can find the excersises -->
https://www.w3resource.com/java-exercises/basic/index.php
 */

public class Basic_Exercises {
    public static void main(String[] args) {
        System.out.println("1) " + "\n" + ex1("Gregory De Cock") + "\n");
        System.out.println("2) " + "\n" +  ex2(10,20) + "\n");
        System.out.println("3) " + "\n" +  ex3(10,20) + "\n");// System.out.println(ex3(10,20));
        System.out.println("4) " + "\n" +  ex4(-5 + 8 * 6,(55+9) % 9, 20 + -3*5 / 8, 5 + 15 / 3 * 2 - 8 % 3) + "\n");
        System.out.println("5) " + "\n" +  ex5(25,5) + "\n");
        System.out.println("6) ");
        ex6(125,24);
        System.out.println("7) ");
        ex7(5);
        System.out.println("8) " + "\n" +  ex8() + "\n");
        System.out.println("9) " + "\n" +  ex9((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) + "\n");
        System.out.println("10) " + "\n" +  ex10(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))) + "\n");
        System.out.println("11) " + "\n" +  ex11(7.5) + "\n");

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


}
