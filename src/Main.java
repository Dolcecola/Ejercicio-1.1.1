import java.util.Scanner;

public class Main{
    public static class Calculadora{
        private
        int x=0,  y=0;

        public
        Calculadora(){}
        void setX(int p)
        {
            x=p;
        }

        void setY(int q)
        {
            y=q;
        }

        int getX()
        {
            return x;
        }

        int getY()
        {
            return y;
        }

        int Suma(int p, int q)
        {
            setX(p);
            setY(q);

            return(x+y);
        }

    }

    public static void main (String[] args)
    {
        int p=0, q=0, suma=0;
        Calculadora s;
        s = new Calculadora();
        System.out.println("Escribe los dos numeros a sumar: ");
        Scanner entrada = new Scanner(System.in);
        p = entrada.nextInt();
        q = entrada.nextInt();

        suma = s.Suma(p,q);

        System.out.println("La suma es: " + suma);

    }
}