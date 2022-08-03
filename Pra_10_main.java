import java.util.Scanner;

public class Pra_10_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter The Name: ");
        s = sc.next(); // input name 
        Pra_10 r= new Pra_10(s); // object make with pass argument

        System.out.println("\nMade By: Jay Patel\n" + "ID:- 21CE092");
    }
}
