import java.util.Scanner;

public class Pra_4 {
    Scanner sc = new Scanner(System.in);
     Pra_4(int z){  // parameter  constructor
        int x[] = new int[z];

        System.out.println("Enter your Array: ");
        for (int i = 0; i < z; i++) {
            x[i] = sc.nextInt();  // input Array 
        }
        int co=0;
        for ( int i=0; i<z-2 ; i++) {   // for logic 
            if (x[i] == 1 && x[i + 1] == 2 && x[i + 2] == 3) {
                co++;
            }
        }

        System.out.print("Your  Array is: ");
            for ( int i=0; i<z; i++)
            {
                System.out.print(x[i]);
                System.out.print(" ");
            }

        System.out.println();
        System.out.print("Sequence of numbers 1, 2, 3 appears in the array somewhere: ");
        if(co==0)
            System.out.println("False (No) ");
        else
            System.out.println("True (Yes) ");
    }
}