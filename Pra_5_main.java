import java.util.*;

public class Pra_5_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1=sc.next();  // input string 
        System.out.println("Enter second string : ");
        String s2=sc.next();  
        Pra_5 d5=new Pra_5(s1,s2); // object make with pass argument
        sc.close();

        System.out.println("Made By: Jay Patel\n" + "ID:- 21CE092");
    }
}
