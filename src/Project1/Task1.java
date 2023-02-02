package Project1;

import java.util.Scanner;

public class Task1 {

    /*
    1)Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all
        stored elements in that array.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Please enter numbers");
        int sum=0;
        int []numbers=new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
