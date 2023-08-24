import java.util.Scanner;

public class PruebaExcepcion extends NumeroNegativoException{
    //Atondo Ojeda Darío Alejandro

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa un valor numérico para obtener su raíz cuadrada: ");


        try {
            double num = s.nextDouble();

            if (num >= 0) {
                double raiz = Math.sqrt(num);
                System.out.println("La raíz cuadrada es: " + raiz);

            } else {
                throw new NumeroNegativoException("Error, se ha ingresado un número negativo");

            }
        }catch(NumeroNegativoException e) {
            System.out.println("Error " + e.getMessage());

        }catch(Exception e) {
            System.out.println("Error, " + e.getMessage());

        }finally {
            s.close();

        }
    }
}
