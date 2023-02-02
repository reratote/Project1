package Project1;

public class task11 {
    //11)Write a program
    // to print out duplicate elements
    // from an Array of Strings?
    public static void main(String[] args) {
        String[] word ={"table","chair","TV","coach","lamp","TV","TV"};
        boolean flag=false;
        for (int i = 0; i < word.length; i++) {
            for (int j = i+1; j < word.length; j++) {
                if(word[i]==word[j]){
                    System.out.println("This is duplicate elements "+word[i]);
                    flag=true;
                }
            }
        }
        if (flag==false){
            System.out.println("Duplicate elements are not found");
        }
    }
}
