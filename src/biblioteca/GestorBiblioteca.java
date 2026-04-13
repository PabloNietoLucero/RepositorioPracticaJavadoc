package biblioteca;

import java.util.ArrayList;

/**
 * Esta clase sirve para manejar todos los libros de la biblioteca.
 * * @author Pablo Nieto Lucero
 * @version 1.0
 * @since 13-04-2026
 */
public class GestorBiblioteca {
    // Lista donde guardaremos los libros
    private ArrayList<Libro> listaLibros;

    /**
     * Constructor para preparar la lista de libros.
     */
    public GestorBiblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    /**
     * Este método sirve para meter un libro nuevo en nuestra lista.
     * @param libro El libro que queremos guardar.
     */
    public void añadirLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Se ha guardado el libro: " + libro.getTitulo());
    }

    /**
     * Este método enseña todos los libros que tenemos.
     * @deprecated Este método es antiguo, mejor usar una aplicación móvil.
     */
    @Deprecated
    public void mostrarTodo() {
        for (Libro l : listaLibros) {
            System.out.println(l.toString());
        }
    }

    /**
     * Este es el método principal que arranca el programa.
     * @param args Configuración del sistema.
     */
    public static void main(String[] args) {
        GestorBiblioteca miBiblio = new GestorBiblioteca();

        // Creamos un libro de prueba
        Libro miLibro = new Libro("Don Quijote", "Cervantes");

        // Lo añadimos y lo mostramos
        miBiblio.añadirLibro(miLibro);
        miBiblio.mostrarTodo();
    }
}