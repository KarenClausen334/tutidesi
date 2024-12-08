package tuti.desi.excepciones;

public class Excepcion extends Exception {

<<<<<<< HEAD
    // Constructor sin parámetros
=======
    // Constructor sin parametros
>>>>>>> 95c730d (agrego)
    public Excepcion() {
        super();
    }

    // Constructor que permite pasar un mensaje de error
    public Excepcion(String message) {
        super(message);
    }

<<<<<<< HEAD
    // Constructor con mensaje y causa (puede ser útil para depuración)
=======
    // Constructor con mensaje y causa 
>>>>>>> 95c730d (agrego)
    public Excepcion(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor con causa
    public Excepcion(Throwable cause) {
        super(cause);
    }
}

