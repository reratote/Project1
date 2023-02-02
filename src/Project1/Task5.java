package Project1;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers.
         Develop a program which will calculate
         the sum of  even and odd numbers for that array.
         */
        int [] [] numbers={{45,67,55,12,46},
                           {5,3,8,9,10,2},
                           {76,45,34,54,2},
                           {6,7,5,13,14}};
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
                }else {
                    sumOdd+=numbers[i][j];
                }
            }
        }
        System.out.println("sum of even number is: "+sumEven);
        System.out.println("sum of odd number is: "+sumOdd);

        }
    }

