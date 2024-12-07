package tuti.desi.excepciones;

public class Excepcion extends Exception {

    // Constructor sin parámetros
    public Excepcion() {
        super();
    }

    // Constructor que permite pasar un mensaje de error
    public Excepcion(String message) {
        super(message);
    }

    // Constructor con mensaje y causa (puede ser útil para depuración)
    public Excepcion(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor con causa
    public Excepcion(Throwable cause) {
        super(cause);
    }
}

