package Project1;

public class Task3 {
    /*Create a 2D array of integer values.
    Print the sum of all numbers.*/
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            System.out.print(sum+" ");
        }
    }
}
