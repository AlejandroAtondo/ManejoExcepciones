import java.util.Scanner;

public class Main {
    //Atondo Ojeda Darío Alejandro

    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        int num = 7;
        System.out.println("Escribe una cadena para recuperar el caracter en la posición: " + num);

        String input = lectTeclado.nextLine();

        caracterEn(input, num);

        lectTeclado.close();
    }


    public static void caracterEn(String frase, int num) {
        try {
            System.out.println("El caracter en la posición: " +
                    num + " es " + frase.charAt(num));

        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Has intentado recuperar una posición" +
                    " de la cadena de caracteres que no existe");

        }


    }
}
