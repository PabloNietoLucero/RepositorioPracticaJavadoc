package biblioteca;

/**
 * Esta clase sirve para guardar los datos de un libro.
 * * @author Pablo Nieto Lucero
 * @version 1.0
 * @since 13-04-2026
 */
public class Libro {
    // Atributos: las cosas que tiene un libro
    private String titulo;
    private String autor;

    /**
     * Este es el constructor para crear el libro.
     * @param titulo El nombre del libro.
     * @param autor El nombre de quien lo escribió.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Este metodo nos dice el título del libro.
     * @return El título guardado.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Este metodo sirve para imprimir los datos del libro fácilmente.
     * @return El libro con su autor en un texto bonito.
     */
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor;
    }
}