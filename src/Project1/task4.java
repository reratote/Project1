package Project1;

public class task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where
        you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int [] num ={1,2,3,4,5,6,7,8};
        for (int i = 0; i < num.length; i++) {
            if(i%2!=0){
                System.out.println(num[i]);
            }
        }
    }
}
