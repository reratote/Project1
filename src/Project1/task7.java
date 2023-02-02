package Project1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*7)Write a java program to check whether a given number is prime or not?

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the numbers");

        int num = scan.nextInt();
        int num1=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                num1++;
            }
        }
        if (num1==2){
            System.out.println("this is prime number:"+ num);
        }else {
            System.out.println("this is not prime number:"+num);
        }
    }
}
