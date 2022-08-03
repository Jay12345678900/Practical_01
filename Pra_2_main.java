import java.util.Scanner;

public class Pra_2_main {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);
        Pra_2 as = new Pra_2();                 // object make
        System.out.print("Enter String:");
        String A=ssc.nextLine();
       as.startOZ(A);                          //method call

        System.out.println("\nMade By: Jay Patel\n" + "ID:- 21CE092");
    }
}