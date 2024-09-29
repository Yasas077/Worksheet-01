import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length:");
        double len=input.nextDouble();
        double inch=(len/2.54);
        double feet=(inch/12);
        int ft=(int) feet;
        System.out.print(len+" cm "+"="+ft+" feet and "+(inch-(ft*12))+" inches");

    }
}
