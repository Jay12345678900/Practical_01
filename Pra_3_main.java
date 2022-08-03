import java.util.Scanner;

public class Pra_3_main {
    public static void main(String[] args) {
        Pra_3 a1= new Pra_3();  // object make 
        int q,w;

        System.out.print("Enter The Two Number= ");
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt(); // input int 
        w=sc.nextInt();
        System.out.printf("last digit(%d,%d)",q,w);
        System.out.print(": ");
        a1.ans();  // method calling

        System.out.println("Made By: Jay Patel\n" + "ID:- 21CE092");
    }
}
