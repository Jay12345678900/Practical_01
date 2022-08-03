import java.util.Scanner;

public class Pra_6_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String[] s = new String[5];
            String s1;
            System.out.println("Enter the array of String");
            for(int i=0;i<5;i++)
            {
                s[i] = sc.next();   // input array 
            }
            System.out.println("Enter the target String");
            s1 = sc.next();   // input sting for target 
            Pra_6 d6 = new Pra_6(s,s1);  // object make with pass argument

            System.out.println("Made By: Jay Patel\n" + "ID:- 21CE092");
    }
}
