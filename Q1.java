import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter an odd length word:");
        Scanner input=new Scanner(System.in);
        String word=input.next();
        while(word.length()%2==0){
            System.out.print("This is not an odd length word enter an odd length word:");
            word=input.next();
        }
        int index=(word.length()+1)/2;
        System.out.println("The middle character of "+word+" is "+word.charAt(index-1));
    }
}
