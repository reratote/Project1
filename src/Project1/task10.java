package Project1;

public class task10 {
    //10)Write a java program to
    // find the second-largest number in the array?
    public static void main(String[] args) {
        int [] num={3,6,5,7,8,12,34};
        int largestNum=num[0];
        int SecondLargestNum=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>largestNum){
                SecondLargestNum=largestNum;
                largestNum=num[i];
            }else if (num[i]>SecondLargestNum){
                SecondLargestNum=num[i];
            }
        }
        System.out.println(SecondLargestNum);

    }
}
