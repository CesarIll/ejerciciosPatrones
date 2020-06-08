package ejercicios3.observer_5;

public class Video {
    private String tipo;
    private String titulo;
    private String tiempo;
    private String categoría;

    public Video(String tipo, String titulo, String tiempo, String categoría) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.categoría = categoría;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
}
