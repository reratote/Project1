package Project1;

public class task9 {
    //9)Maximum and minimum number in the array?
    public static void main(String[] args) {
        int [] num= {5,3,2,8,9,5,17};
        int max=num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {//start from 0 bc we assign num[0] already
            if(num[i]> max){
                max=num[i];
            } else if (num[i]< min){
                min=num[i];
            }

        }
        System.out.println("Maximum number is "+ max);
        System.out.println("Minimum number is "+min);

    }
}
