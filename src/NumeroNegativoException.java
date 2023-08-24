public class NumeroNegativoException extends Exception {
    //Atondo Ojeda Darío Alejandro

    public NumeroNegativoException() {
        super("Error, se ha ingresado un número negativo");
    }

    public NumeroNegativoException(String message) {
        super(message);
    }


}
