package proxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Archivo archivo1 = new Archivo("archivo1", ".rar");
        Archivo archivo2 = new Archivo("archivo2", ".doc");
        Archivo archivo3 = new Archivo("archivo3", ".zip");
        Archivo archivo4 = new Archivo("archivo4", ".xml");
        Archivo archivo5 = new Archivo("archivo5", ".java");

        proxy.cargaArchivo(archivo1);
        proxy.cargaArchivo(archivo2);
        proxy.cargaArchivo(archivo3);
        proxy.cargaArchivo(archivo4);
        proxy.cargaArchivo(archivo5);

        proxy.descargaArchivo(archivo1.getNombre(), archivo1.getExtension());
        proxy.descargaArchivo(archivo2.getNombre(), archivo2.getExtension());
        proxy.descargaArchivo(archivo3.getNombre(), archivo3.getExtension());
    }
}
