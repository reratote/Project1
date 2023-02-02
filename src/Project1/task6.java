package Project1;

public class task6 {
    /*
    6)Write a program to swap 2 numbers without a temporary variable?
     */
    public static void main(String[] args) {
        int a=5, b=15;
        System.out.println("number before swapping a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("number after swapping a: "+a+" b: "+b);
    }
}
