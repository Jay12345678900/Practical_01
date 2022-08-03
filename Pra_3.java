public class Pra_3 {
    public int q, w;
    Pra_3() {}     //default constructor

    Pra_3(int x, int y) {   //parameter  constructor 

        q = x;
        w = y;
        {
            q = q % 10;     //logic 
            w = w % 10;
        }
    }

        void ans ()     // method 
        {
            if (q == w)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");

        }
}
