package proxy;

public interface IServidor {
    Archivo descargaArchivo(String nombre, String extension);
    void cargaArchivo(Archivo archivo);
}
